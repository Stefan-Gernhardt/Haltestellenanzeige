package org.sge.haltestellenanzeige.net;

/**
 * Created by peter on 06.12.2017.
 */

public interface  StationBoardInterface {
    public final static int DELAY_SERVERITY_UNKNOWN   = 0;
    public final static int DELAY_SERVERITY_GREEN     = 1; // delay in minutes = 0
    public final static int DELAY_SERVERITY_YELLOW    = 2; // delay in minutes [1,3]
    public final static int DELAY_SERVERITY_RED       = 3; // delay in minutes > 3
    public final static int DELAY_SERVERITY_CANCELLED = 4; // ride cancelled

    public final static int DELAY_UNIT_UNKNOWN = 0;
    public final static int DELAY_UNIT_UHRZEIT = 1;
    public final static int DELAY_UNIT_MINUTEN = 2;
    public final static int DELAY_UNIT_PKTL    = 3;

    public final static int BORDER_DELAY_MINUTES_BETWEEN_YELLOW_AND_RED = 3;

    abstract public String getDepartureRow(int r);
    abstract public String getPredictionRow(int r);
    abstract public Integer getPredictionSeverityRow(int r);
    abstract public String getLineRow(int r);
    abstract public String getDestinationRow(int r);
    abstract public String getPlatformRow(int r);
    abstract public String getOPNVTag();
    abstract public double getDelayRate();
    abstract public double getQMRate();
}
