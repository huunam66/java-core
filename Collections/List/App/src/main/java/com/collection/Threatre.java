package com.collection;

public interface Threatre {

    boolean addSeat(ThreatreImpl.Seat seat);

    void setUpThreatre();

    boolean reservedSeat(String seatNumber);

    boolean cancelSeat(String seatNumber);

    boolean isReservedSeat(String seatNumber);

    void printThreatre();

    void sort();

    ThreatreImpl.Seat seatMIN(int from, int to);

    int indexMIN(int from, int to);

    ThreatreImpl.Seat binarySearch(String seatNumber);

}
