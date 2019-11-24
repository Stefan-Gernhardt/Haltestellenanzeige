package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;

/**
 * Created by Admin on 09.02.2018.
 */

public class ParserSuggestionList_VRN extends ParserSuggestionList_Type1Json {
    public ParserSuggestionList_VRN() {}
    public ParserSuggestionList_VRN(OPNV_VRN opnv, String jsonStringSuggestionList) {
        parseSuggestionListResponse(opnv, jsonStringSuggestionList);
    }
}
