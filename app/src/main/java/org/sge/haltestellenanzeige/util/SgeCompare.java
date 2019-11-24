package org.sge.haltestellenanzeige.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SgeCompare {

    public static int StringCompare(String s1, String s2) {
        if (s1 == null)
            s1 = "";
        if (s2 == null)
            s2 = "";

        String sorted1 = sortieren(s1);
        String sorted2 = sortieren(s2);

        return apply(sorted1, sorted2);
    }

    private static Pattern compilePattern() {
        final String pattern = "[^\\p{Alnum}]"; // NON-NLS
        Pattern p;

        try {
            p = Pattern.compile(pattern, Pattern.UNICODE_CHARACTER_CLASS);
        } catch (IllegalArgumentException e) {
            p = Pattern.compile(pattern);
        }

        return p;
    }

    public static String subNonAlphaNumeric(String in, String sub) {
        Matcher m = compilePattern().matcher(in);

        if (m.find()) {
            return m.replaceAll(sub);
        } else {
            return in;
        }
    }

    public static String bearbeiten(String in) {
        in = subNonAlphaNumeric(in, " ");
        in = in.toLowerCase();
        in = in.trim();

        return in;
    }

    private static String sortieren(String in) {
        in = bearbeiten(in);
        String[] wordsArray = in.split("\\s+"); // NON-NLS

        List<String> words = Arrays.asList(wordsArray);
        String joined = sortierenUndZusammensetzen(words, " ");

        return joined.trim();
    }

    static public String sortierenUndZusammensetzen(List<String> col, String sep) {
        Collections.sort(col);
        return zusammensetzen(col, sep);
    }

    static String zusammensetzen(List<String> strings, String sep) {
        final StringBuilder buf = new StringBuilder(strings.size() * 16);

        for (int i = 0; i < strings.size(); i++) {
            if (i < strings.size()) {
                buf.append(sep);
            }
            buf.append(strings.get(i));
        }

        return buf.toString().trim();
    }

    public static EditOp[] getEditOps(String s1, String s2) {
        return getEditOps(s1.length(), s1, s2.length(), s2);
    }

    private static MatchingBlock[] getMatchingBlocks(int len1, int len2, EditOp[] ops) {
        int n = ops.length;
        int numberOfMatchingBlocks, i, spos, dpos;
        numberOfMatchingBlocks = 0;
        int o = 0;
        spos = dpos = 0;
        EditType type;
        for (i = n; i != 0;) {
            while (ops[o].type == EditType.KEEP && --i != 0) {
                o++;
            }

            if (i == 0)
                break;
            if (spos < ops[o].spos || dpos < ops[o].dpos) {
                numberOfMatchingBlocks++;
                spos = ops[o].spos;
                dpos = ops[o].dpos;
            }

            type = ops[o].type;

            switch (type) {
                case REPLACE:
                    do {
                        spos++;
                        dpos++;
                        i--;
                        o++;
                    } while (i != 0 && ops[o].type == type && spos == ops[o].spos && dpos == ops[o].dpos);
                    break;

                case DELETE:
                    do {
                        spos++;
                        i--;
                        o++;
                    } while (i != 0 && ops[o].type == type && spos == ops[o].spos && dpos == ops[o].dpos);
                    break;

                case INSERT:
                    do {
                        dpos++;
                        i--;
                        o++;
                    } while (i != 0 && ops[o].type == type && spos == ops[o].spos && dpos == ops[o].dpos);
                    break;

                default:
                    break;
            }
        }

        if (spos < len1 || dpos < len2) {
            numberOfMatchingBlocks++;
        }

        MatchingBlock[] matchingBlocks = new MatchingBlock[numberOfMatchingBlocks + 1];

        o = 0;
        spos = dpos = 0;
        int mbIndex = 0;

        for (i = n; i != 0;) {

            while (ops[o].type == EditType.KEEP && --i != 0)
                o++;

            if (i == 0)
                break;

            if (spos < ops[o].spos || dpos < ops[o].dpos) {
                MatchingBlock mb = new MatchingBlock();

                mb.spos = spos;
                mb.dpos = dpos;
                mb.length = ops[o].spos - spos;
                spos = ops[o].spos;
                dpos = ops[o].dpos;

                matchingBlocks[mbIndex++] = mb;

            }

            type = ops[o].type;

            switch (type) {
                case REPLACE:
                    do {
                        spos++;
                        dpos++;
                        i--;
                        o++;
                    } while (i != 0 && ops[o].type == type && spos == ops[o].spos && dpos == ops[o].dpos);
                    break;

                case DELETE:
                    do {
                        spos++;
                        i--;
                        o++;
                    } while (i != 0 && ops[o].type == type && spos == ops[o].spos && dpos == ops[o].dpos);
                    break;

                case INSERT:
                    do {
                        dpos++;
                        i--;
                        o++;
                    } while (i != 0 && ops[o].type == type && spos == ops[o].spos && dpos == ops[o].dpos);
                    break;

                default:
                    break;
            }
        }

        if (spos < len1 || dpos < len2) {
            assert len1 - spos == len2 - dpos;

            MatchingBlock mb = new MatchingBlock();
            mb.spos = spos;
            mb.dpos = dpos;
            mb.length = len1 - spos;

            matchingBlocks[mbIndex++] = mb;
        }

        assert numberOfMatchingBlocks == mbIndex;

        MatchingBlock finalBlock = new MatchingBlock();
        finalBlock.spos = len1;
        finalBlock.dpos = len2;
        finalBlock.length = 0;

        matchingBlocks[mbIndex] = finalBlock;

        return matchingBlocks;
    }


    public static MatchingBlock[] getMatchingBlocks(int len1, int len2, OpCode[] ops) {
        int n = ops.length;
        int noOfMB, i;
        int o = 0;
        noOfMB = 0;

        for (i = n; i-- != 0; o++) {

            if (ops[o].type == EditType.KEEP) {

                noOfMB++;

                while (i != 0 && ops[o].type == EditType.KEEP) {
                    i--;
                    o++;
                }

                if (i == 0)
                    break;
            }

        }

        MatchingBlock[] matchingBlocks = new MatchingBlock[noOfMB + 1];
        int mb = 0;
        o = 0;
        matchingBlocks[mb] = new MatchingBlock();

        for (i = n; i != 0; i--, o++) {
            if (ops[o].type == EditType.KEEP) {
                matchingBlocks[mb].spos = ops[o].sbeg;
                matchingBlocks[mb].dpos = ops[o].dbeg;

                while (i != 0 && ops[o].type == EditType.KEEP) {
                    i--;
                    o++;
                }

                if (i == 0) {
                    matchingBlocks[mb].length = len1 - matchingBlocks[mb].spos;
                    mb++;
                    break;
                }

                matchingBlocks[mb].length = ops[o].sbeg - matchingBlocks[mb].spos;
                mb++;
                matchingBlocks[mb] = new MatchingBlock();
            }
        }

        assert mb == noOfMB;

        MatchingBlock finalBlock = new MatchingBlock();
        finalBlock.spos = len1;
        finalBlock.dpos = len2;
        finalBlock.length = 0;

        matchingBlocks[mb] = finalBlock;

        return matchingBlocks;
    }


    private static EditOp[] getEditOps(int len1, String s1, int len2, String s2) {
        int len1o, len2o;
        int i;

        int[] matrix;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int p1 = 0;
        int p2 = 0;

        len1o = 0;

        while (len1 > 0 && len2 > 0 && c1[p1] == c2[p2]) {
            len1--;
            len2--;

            p1++;
            p2++;

            len1o++;
        }

        len2o = len1o;

        while (len1 > 0 && len2 > 0 && c1[p1 + len1 - 1] == c2[p2 + len2 - 1]) {
            len1--;
            len2--;
        }

        len1++;
        len2++;

        matrix = new int[len2 * len1];

        for (i = 0; i < len2; i++)
            matrix[i] = i;
        for (i = 1; i < len1; i++)
            matrix[len2 * i] = i;

        for (i = 1; i < len1; i++) {

            int ptrPrev = (i - 1) * len2;
            int ptrC = i * len2;
            int ptrEnd = ptrC + len2 - 1;

            char char1 = c1[p1 + i - 1];
            int ptrChar2 = p2;

            int x = i;

            ptrC++;

            while (ptrC <= ptrEnd) {

                int c3 = matrix[ptrPrev++] + (char1 != c2[ptrChar2++] ? 1 : 0);
                x++;

                if (x > c3) {
                    x = c3;
                }

                c3 = matrix[ptrPrev] + 1;

                if (x > c3) {
                    x = c3;
                }

                matrix[ptrC++] = x;

            }

        }

        return editOpsFromCostMatrix(len1, c1, p1, len1o, len2, c2, p2, len2o, matrix);
    }


    private static EditOp[] editOpsFromCostMatrix(int len1, char[] c1, int p1, int o1, int len2, char[] c2, int p2,
                                                  int o2, int[] matrix) {

        int i, j, pos;
        int ptr;
        EditOp[] ops;
        int dir = 0;

        pos = matrix[len1 * len2 - 1];
        ops = new EditOp[pos];

        i = len1 - 1;
        j = len2 - 1;

        ptr = len1 * len2 - 1;

        while (i > 0 || j > 0) {

            if (dir < 0 && j != 0 && matrix[ptr] == matrix[ptr - 1] + 1) {

                EditOp eop = new EditOp();

                pos--;
                ops[pos] = eop;
                eop.type = EditType.INSERT;
                eop.spos = i + o1;
                eop.dpos = --j + o2;
                ptr--;

                continue;
            }

            if (dir > 0 && i != 0 && matrix[ptr] == matrix[ptr - len2] + 1) {

                EditOp eop = new EditOp();

                pos--;
                ops[pos] = eop;
                eop.type = EditType.DELETE;
                eop.spos = --i + o1;
                eop.dpos = j + o2;
                ptr -= len2;

                continue;

            }

            if (i != 0 && j != 0 && matrix[ptr] == matrix[ptr - len2 - 1] && c1[p1 + i - 1] == c2[p2 + j - 1]) {

                i--;
                j--;
                ptr -= len2 + 1;
                dir = 0;

                continue;

            }

            if (i != 0 && j != 0 && matrix[ptr] == matrix[ptr - len2 - 1] + 1) {

                pos--;

                EditOp eop = new EditOp();
                ops[pos] = eop;

                eop.type = EditType.REPLACE;
                eop.spos = --i + o1;
                eop.dpos = --j + o2;

                ptr -= len2 + 1;
                dir = 0;
                continue;

            }

            if (dir == 0 && j != 0 && matrix[ptr] == matrix[ptr - 1] + 1) {

                pos--;
                EditOp eop = new EditOp();
                ops[pos] = eop;
                eop.type = EditType.INSERT;
                eop.spos = i + o1;
                eop.dpos = --j + o2;
                ptr--;
                dir = -1;

                continue;
            }

            if (dir == 0 && i != 0 && matrix[ptr] == matrix[ptr - len2] + 1) {
                pos--;
                EditOp eop = new EditOp();
                ops[pos] = eop;

                eop.type = EditType.DELETE;
                eop.spos = --i + o1;
                eop.dpos = j + o2;
                ptr -= len2;
                dir = 1;
                continue;
            }

            assert false;
        }

        return ops;
    }


    public static MatchingBlock[] getMatchingBlocks(String s1, String s2) {
        return getMatchingBlocks(s1.length(), s2.length(), getEditOps(s1, s2));
    }


    private static int memchr(char[] haystack, int offset, char needle, int num) {
        if (num != 0) {
            int p = 0;

            do {
                if (haystack[offset + p] == needle)
                    return 1;

                p++;

            } while (--num != 0);

        }
        return 0;
    }


    public static int levEditDistance(String s1, String s2, int xcost) {
        int i;
        int half;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int str1 = 0;
        int str2 = 0;

        int len1 = s1.length();
        int len2 = s2.length();

        while (len1 > 0 && len2 > 0 && c1[str1] == c2[str2]) {
            len1--;
            len2--;
            str1++;
            str2++;
        }

        while (len1 > 0 && len2 > 0 && c1[str1 + len1 - 1] == c2[str2 + len2 - 1]) {
            len1--;
            len2--;
        }

        if (len1 == 0)
            return len2;
        if (len2 == 0)
            return len1;

        if (len1 > len2) {

            int nx = len1;
            int temp = str1;

            len1 = len2;
            len2 = nx;

            str1 = str2;
            str2 = temp;

            char[] t = c2;
            c2 = c1;
            c1 = t;
        }

        if (len1 == 1) {
            if (xcost != 0) {
                return len2 + 1 - 2 * memchr(c2, str2, c1[str1], len2);
            } else {
                return len2 - memchr(c2, str2, c1[str1], len2);
            }
        }

        len1++;
        len2++;
        half = len1 >> 1;

        int[] row = new int[len2];
        int end = len2 - 1;

        for (i = 0; i < len2 - (xcost != 0 ? 0 : half); i++)
            row[i] = i;

        if (xcost != 0) {

            for (i = 1; i < len1; i++) {

                int p = 1;

                char ch1 = c1[str1 + i - 1];
                int c2p = str2;

                int D = i;
                int x = i;

                while (p <= end) {

                    if (ch1 == c2[c2p++]) {
                        x = --D;
                    } else {
                        x++;
                    }
                    D = row[p];
                    D++;

                    if (x > D)
                        x = D;
                    row[p++] = x;

                }

            }

        } else {

            row[0] = len1 - half - 1;
            for (i = 1; i < len1; i++) {
                int p;

                char ch1 = c1[str1 + i - 1];
                int c2p;

                int D, x;

                if (i >= len1 - half) {
                    int offset = i - (len1 - half);
                    int c3;

                    c2p = str2 + offset;
                    p = offset;
                    c3 = row[p++] + ((ch1 != c2[c2p++]) ? 1 : 0);
                    x = row[p];
                    x++;
                    D = x;
                    if (x > c3) {
                        x = c3;
                    }
                    row[p++] = x;
                } else {
                    p = 1;
                    c2p = str2;
                    D = x = i;
                }
                if (i <= half + 1)
                    end = len2 + i - half - 2;
                while (p <= end) {
                    int c3 = --D + ((ch1 != c2[c2p++]) ? 1 : 0);
                    x++;
                    if (x > c3) {
                        x = c3;
                    }
                    D = row[p];
                    D++;
                    if (x > D)
                        x = D;
                    row[p++] = x;

                }

                if (i <= half) {
                    int c3 = --D + ((ch1 != c2[c2p]) ? 1 : 0);
                    x++;
                    if (x > c3) {
                        x = c3;
                    }
                    row[p] = x;
                }
            }
        }

        i = row[end];

        return i;
    }


    public static double getRatio(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int lensum = len1 + len2;

        int editDistance = levEditDistance(s1, s2, 1);

        return (lensum - editDistance) / (double) lensum;
    }


    public static int apply(String s1, String s2) {
        String shorter;
        String longer;

        if (s1.length() < s2.length()) {

            shorter = s1;
            longer = s2;
        } else {
            shorter = s2;
            longer = s1;
        }

        MatchingBlock[] matchingBlocks = getMatchingBlocks(shorter, longer);

        List<Double> scores = new ArrayList<>();

        for (MatchingBlock mb : matchingBlocks) {

            int dist = mb.dpos - mb.spos;

            int long_start = dist > 0 ? dist : 0;
            int long_end = long_start + shorter.length();

            if (long_end > longer.length())
                long_end = longer.length();

            String long_substr = longer.substring(long_start, long_end);

            double ratio = getRatio(shorter, long_substr);

            if (ratio > .995) {
                return 100;
            } else {
                scores.add(ratio);
            }
        }

        return (int) Math.round(100 * Collections.max(scores));
    }
}

final class OpCode {

    public EditType type;
    public int sbeg, send;
    public int dbeg, dend;

    public String toString() {
        return type.name() + "(" + sbeg + "," + send + "," + dbeg + "," + dend + ")";
    }
}

final class MatchingBlock {
    public int spos;
    public int dpos;
    public int length;

    public String toString() {
        return "(" + spos + "," + dpos + "," + length + ")";
    }
}

final class EditOp {
    public EditType type;
    public int spos;
    public int dpos;

    public String toString() {
        return type.name() + "(" + spos + "," + dpos + ")";
    }
}

enum EditType {
    DELETE, EQUAL, INSERT, REPLACE, KEEP
}
