package org.sge.haltestellenanzeige;

import android.support.test.runner.AndroidJUnit4;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.util.SgeCompare;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Admin on 10.02.2018.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class FuzzyStringComparisonTest {

    @org.junit.Test
    public void test_01_tokenSortPartialRatio_Unit() {
        System.out.println("test_01_TwoStationNames");

        assertEquals(SgeCompare.StringCompare("equal","equal"), SgeCompare.StringCompare("equal","equal"));
        assertEquals(SgeCompare.StringCompare("mysmilarstring","myawfullysimilarstirng"), SgeCompare.StringCompare("mysmilarstring","myawfullysimilarstirng"));
        assertEquals(SgeCompare.StringCompare("mysmilarstring","mysimilarstring"), SgeCompare.StringCompare("mysmilarstring","mysimilarstring"));
        assertEquals(SgeCompare.StringCompare("my smi larstring","mysi milar string"), SgeCompare.StringCompare("my smi larstring","mysi milar string"));
        assertEquals(SgeCompare.StringCompare("my smilar string","string my smile"), SgeCompare.StringCompare("my smilar string","string my smile"));
        assertEquals(SgeCompare.StringCompare("my","my "), SgeCompare.StringCompare("my","my "));
    }
}
