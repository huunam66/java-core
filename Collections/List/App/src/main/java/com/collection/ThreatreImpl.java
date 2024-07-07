package com.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ThreatreImpl implements Threatre {
    private String threatreName;
    private int numRow;
    private int numColumn;  
    private List<Seat> seatList = new ArrayList<>();


    public ThreatreImpl() {
        this(null, 0, 0);
    }

    public ThreatreImpl(String threatreName, int numRow, int numColumn) {
        this(threatreName, numRow, numColumn, null);
    }

    public ThreatreImpl(String threatreName, int numRow, int numColumn, List<Seat> seatList) {
        this.threatreName = threatreName;
        this.numRow = numRow;
        this.numColumn = numColumn;
        if (seatList != null) this.seatList = seatList;
    }

    @Override
    public boolean addSeat(Seat seat) {
        if (seat == null) return false;
        boolean isExistedSeat = seatList.stream().filter(item -> item.getSeatNumber().equalsIgnoreCase(seat.getSeatNumber())).findFirst().isPresent();
        if (isExistedSeat) return false;
        this.seatList.add(seat);
        return true;
    }

    @Override
    public void sort() {
        for (int i = 0; i < seatList.size(); i++) {
            int indexMIN = indexMIN(i, seatList.size() - 1);
            if (indexMIN == i) continue;

            Collections.swap(seatList, i, indexMIN);
//            Seat temp = seatList.get(i);
//            seatList.set(i, seatList.get(indexMIN));
//            seatList.set(indexMIN, temp);
        }
    }

    @Override
    public Seat seatMIN(int from, int to) {
        Seat seatMIN = seatList.get(from);
        for (int i = from + 1; i <= to; i++) {
            Seat seatI = seatList.get(i);
            if (seatI.compareTo(seatMIN) < 0) {
                seatMIN = seatI;
            }
        }
        return seatMIN;
    }

    @Override
    public int indexMIN(int from, int to) {
        int index = from;
        Seat seatMIN = seatList.get(from);
        for (int i = from + 1; i <= to; i++) {
            Seat seatI = seatList.get(i);
            if (seatI.compareTo(seatMIN) < 0) {
                index = i;
                seatMIN = seatI;
            }
        }
        return index;
    }

    @Override
    public void setUpThreatre() {
        int lastRow = 'A' + numRow;
        for (char i = 'A'; i < lastRow; i++) {
            for (int j = 0; j < numColumn; j++) {
//                System.out.println(String.format("%s", String.valueOf(i) + j));
                if (j < 9) addSeat(new Seat(i + String.format("0%d", j + 1)));
                else addSeat(new Seat(i + String.format("%d", j + 1)));
            }
        }

        sort();
    }


    @Override
    public Seat binarySearch(String seatNumber) {
        Seat seatSearch = new Seat(seatNumber);
        int low = 0;
        int high = seatList.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Seat seatMID = seatList.get(mid);
            int cmpSeat = seatMID.compareTo(seatSearch);
            if (cmpSeat == 0) return seatMID;

            if (cmpSeat < 1) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    @Override
    public boolean reservedSeat(String seatNumber) {
        Seat seatSearch = binarySearch(seatNumber);

        if (seatSearch == null) {
            System.out.println("Seat not found !");
            return false;
        }

        return seatSearch.reserved();
    }

    @Override
    public boolean cancelSeat(String seatNumber) {
        Seat seatSearch = binarySearch(seatNumber);

        if (seatSearch == null) {
            System.out.println("Seat not found !");
            return false;
        }

        return seatSearch.cancel();
    }

    @Override
    public boolean isReservedSeat(String seatNumber) {
        Optional<Seat> optionalSeat = seatList.stream().filter(item -> item.isSeat(seatNumber)).findFirst();
        if (!optionalSeat.isPresent()) {
            System.out.println("Seat not found !");
            return false;
        }

        boolean reserved = optionalSeat.get().isReserved();
        if (!reserved) System.out.println("Please pay.");

        return reserved;
    }

    @Override
    public void printThreatre() {
        for (int i = 0; i < numColumn; i++) {
            for (int j = 0; j < numRow; j++) {
                int index = j * numColumn + i;
                System.out.print(String.format("%s\t", seatList.get(index)));
            }
            System.out.println();
        }
    }


    public class Seat implements Comparable<Seat> {
        private String seatNumber;
        private boolean reserved = false;

        public Seat() {
            this(null);
        }

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }

        @Override
        public int compareTo(Seat o) {
            return seatNumber.compareTo(o.getSeatNumber());
        }

        public boolean reserved() {
            if (reserved) {
                System.out.println(String.format("Sorry, %s had reserved !", seatNumber));
                return !reserved;
            }

            setReversed(true);
            System.out.println(String.format("%s is reserved !", seatNumber));

            return reserved;
        }

        public boolean cancel() {
            if (!reserved) {
                System.out.println(String.format("Sorry, %s isn't reserved !", seatNumber));
                return reserved;
            }

            setReversed(false);
            System.out.println(String.format("%s is calceled !", seatNumber));

            return !reserved;
        }

        public void setReversed(boolean reserved) {
            this.reserved = reserved;
        }

        public boolean isSeat(String seatNumber) {
            return this.seatNumber.equalsIgnoreCase(seatNumber);
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public void setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public String toString() {
            return seatNumber;
        }
    }

}
