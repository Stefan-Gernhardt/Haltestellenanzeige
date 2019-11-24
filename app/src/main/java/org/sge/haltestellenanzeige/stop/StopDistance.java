package org.sge.haltestellenanzeige.stop;

public class StopDistance {
    public boolean isMatch;
    public int nameDistance;
    public double coordDistance;


    public StopDistance() {
        isMatch = false;
        nameDistance = 0;
        coordDistance = Double.MAX_VALUE;
    }


    public static boolean isBetter(StopDistance stopDistance, StopDistance topStopDistance) {
        if(stopDistance.isMatch & !topStopDistance.isMatch) return true;
        if(!stopDistance.isMatch & topStopDistance.isMatch) return false;

        if(stopDistance.nameDistance > topStopDistance.nameDistance) return true;
        if(stopDistance.nameDistance < topStopDistance.nameDistance) return false;

        if(stopDistance.coordDistance < topStopDistance.coordDistance) return true;
        if(stopDistance.coordDistance > topStopDistance.coordDistance) return false;

        return false;
    }


    public static double distanceDeviation(double xCoord1, double yCoord1, double xCoord2, double yCoord2) {
        return Math.abs(xCoord1 - xCoord2) + Math.abs(yCoord1 - yCoord2);
    }

}
