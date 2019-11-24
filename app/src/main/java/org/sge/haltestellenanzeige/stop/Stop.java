package org.sge.haltestellenanzeige.stop;

import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.settings.Settings;
import org.sge.haltestellenanzeige.util.Util;

public class Stop extends StopI {
    final private String name;
    final private String id;
    final private double xCoord;
    final private double yCoord;
    final private String urlForStationBoardRequest;
    final private OPNV opnv;

    public Stop(OPNV opnvPara, String namePara, String idPara, double xCoordPara, double yCoordPara, String urlForStationBoardRequestPara) {
        // System.out.println("constructor Stop");
        if(opnvPara == null) {
            opnv = OPNV.PRIMARY_OPNV;
            Util.warningMessage("try to create Stop object without opnv. Opnv is null! Using OPNV.PRIMARY_OPNV instead"); //NON-NLS
        }
        else opnv = opnvPara;

        /*
        if(namePara == null) {
            name = "";
            Util.warningMessage("try to create Stop object without name. Name is null!");
        }
        else name = namePara;
        */
        name = namePara;

        if(idPara == null) {
            id = "";
            Util.warningMessage("try to create Stop object without id. Id is null!"); //NON-NLS
        }
        else this.id = idPara;

        xCoord = xCoordPara;
        yCoord = yCoordPara;

        if(urlForStationBoardRequestPara == null) {
            urlForStationBoardRequest = "";
            Util.warningMessage("try to create Stop object without url. Url is null!"); //NON-NLS
        }
        else {
            urlForStationBoardRequest = urlForStationBoardRequestPara;

            if (urlForStationBoardRequestPara.isEmpty()) {
                Util.warningMessage("try to create Stop object without url. Url is empty!"); //NON-NLS
                System.out.println("OPNV: " + opnvPara + "  name: " + namePara + " id: " + idPara + " x: " + xCoordPara + " y: " + yCoordPara + " url: " + urlForStationBoardRequestPara); //NON-NLS
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getUrl() {
        return urlForStationBoardRequest;
    }

    @Override
    public double getXCoord() {
        return xCoord;
    }

    @Override
    public double getYCoord() {
        return yCoord;
    }

    @Override
    public OPNV getOPNV() {
        return opnv;
    }

}
