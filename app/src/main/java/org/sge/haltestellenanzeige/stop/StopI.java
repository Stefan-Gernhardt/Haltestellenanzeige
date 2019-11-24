package org.sge.haltestellenanzeige.stop;

import org.sge.haltestellenanzeige.opnv.OPNV;

/**
 * Created by Admin on 10.02.2018.
 */

public abstract class StopI {
    abstract public String getName();
    abstract public String getId();
    abstract public String getUrl();
    abstract public double getXCoord();
    abstract public double getYCoord();
    abstract public OPNV getOPNV();
}
