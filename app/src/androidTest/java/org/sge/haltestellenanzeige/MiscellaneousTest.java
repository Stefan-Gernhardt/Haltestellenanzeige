package org.sge.haltestellenanzeige;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.opnv.OPNVManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import dalvik.system.DexFile;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class MiscellaneousTest {

    @Test
    public void test_01_OPNVTagsAreDifferent() {
        System.out.println("test_01_OPNVTagsAreDifferent");

        HashSet<String> opnvSet = new HashSet<String>();

        ArrayList<OPNV> opnvList =  OPNVManager.getInstance().getOPNVList();
        for(OPNV opnv : opnvList) {
            assertTrue(!opnvSet.contains(opnv.getTag()));
            opnvSet.add(opnv.getTag());
        }
    }


    private String[] getClassesOfPackage(String packageName) {
        Context context = InstrumentationRegistry.getTargetContext();

        ArrayList<String> classes = new ArrayList<String>();
        try {
            String packageCodePath = context.getPackageCodePath();
            DexFile df = new DexFile(packageCodePath);
            for (Enumeration<String> iter = df.entries(); iter.hasMoreElements(); ) {
                String className = iter.nextElement();
                if (className.contains(packageName)) {
                    classes.add(className.substring(className.lastIndexOf(".") + 1, className.length()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return classes.toArray(new String[classes.size()]);
    }


    @Test
    public void test_02_CountParsers() {
        System.out.println("test_02_CountParsers");

        String[] classNamesOfPackage = getClassesOfPackage("org.sge.haltestellenanzeige.parser.parserStationBoard");
        int counterClasses = 0;
        for(int i=0; i<classNamesOfPackage.length; i++) {
            System.out.println("class name: " + classNamesOfPackage[i]);
            String classNameText = classNamesOfPackage[i];
            if(classNameText != null) {
                if(!classNameText.contentEquals("Parser")) {
                    if(classNameText.startsWith("Parser")) counterClasses++;
                }
            }
        }

        assertEquals(counterClasses, OPNVManager.getInstance().getOPNVList().size());
    }


    @Test
    public void test_03_CountOPNVs() {
        System.out.println("test_03_CountOPNVs");

        String[] classNamesOfPackage = getClassesOfPackage("org.sge.haltestellenanzeige.opnv");
        int counterClasses = 0;
        for(int i=0; i<classNamesOfPackage.length; i++) {
            System.out.println("class name: " + classNamesOfPackage[i]);
            String classNameText = classNamesOfPackage[i];
            if(classNameText != null) {
                if(!classNameText.contentEquals("OPNV") && !classNameText.contentEquals("OPNVJsonRequest") && !classNameText.contentEquals("OPNVStringRequest") && !classNameText.contentEquals("OPNVimpl") && !classNameText.contentEquals("OPNVManager")) {
                    if(classNameText.startsWith("OPNV_")) counterClasses++;
                }
            }
        }

        assertEquals(counterClasses, OPNVManager.getInstance().getOPNVList().size());
    }
}
