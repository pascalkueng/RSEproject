package ch.ethz.rse.integration.tests;

import ch.ethz.rse.TrainStation;

// expected results:
// TRACK_NON_NEGATIVE SAFE
// TRACK_IN_RANGE SAFE
// NO_CRASH SAFE

public class Multiple_Stations_Safe {
    public static void m3(int j) {
        TrainStation s1 = new TrainStation(10);
        if (0 <= j && j < 10) {
            // 0<=j<10
            // s can only point to an object with 10 tracks
            s1.arrive(j);
        }
        TrainStation s2 = new TrainStation(10);
        if (0 <= j && j < 10) {
            // 0<=j<10
            // s can only point to an object with 10 tracks
            s2.arrive(j);
        }
    }
}
