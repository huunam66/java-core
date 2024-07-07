package com.collection;

public class Main {
    public static void main(String[] args) {
        Threatre threatre = new ThreatreImpl("test", 8, 12);
        threatre.setUpThreatre();
        threatre.printThreatre();
        System.out.println("=".repeat(40));
        threatre.isReservedSeat("C10");
        threatre.reservedSeat("C10");
        threatre.reservedSeat("C10");
        threatre.reservedSeat("C11");
        System.out.println(threatre.isReservedSeat("C10"));
        System.out.println(threatre.isReservedSeat("C11"));
        threatre.isReservedSeat("C11");
        threatre.cancelSeat("C11");
        threatre.reservedSeat("C11");
    }
}