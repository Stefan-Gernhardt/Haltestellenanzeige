package org.sge.haltestellenanzeige.opnv;

import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_BahnDB;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_HVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_KVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_MVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_RMV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_SaarSVV;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VBN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VGN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRN;
import org.sge.haltestellenanzeige.opnv.opnvs.OPNV_VRR;

import java.util.ArrayList;

public class OPNVManager {
    private static OPNVManager opnvManager = null;
    private ArrayList<OPNV> opnvList = null;

    public static OPNVManager getInstance() {
        if(opnvManager == null) opnvManager = new OPNVManager();

        return opnvManager;
    }


    private OPNVManager() {
        opnvList = new ArrayList<OPNV>();

        opnvList.add(OPNV_BahnDB.getInstance());
        opnvList.add(OPNV_VRN.getInstance());
        opnvList.add(OPNV_SaarSVV.getInstance());
        opnvList.add(OPNV_RMV.getInstance());
        opnvList.add(OPNV_KVV.getInstance());
        opnvList.add(OPNV_VBN.getInstance());
        opnvList.add(OPNV_HVV.getInstance());
        opnvList.add(OPNV_MVV.getInstance());
        opnvList.add(OPNV_VRR.getInstance());
        opnvList.add(OPNV_VGN.getInstance());
    }


    public ArrayList<OPNV> getOPNVList() {
        return opnvList;
    }


    public OPNV getOPNV(String opnvTag) {
        for(OPNV opnv : opnvList) {
            if(opnv.getTag().contentEquals(opnvTag)) return opnv;
        }

        return null;
    }
}
