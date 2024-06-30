package org.example.Data;

import org.example.Sports.Sport;

import java.util.ArrayList;
import java.util.List;

public class ReaderInstance extends ReaderImpl {

    public ReaderInstance() {
        this(new ArrayList<>());
    }

    public ReaderInstance(List<Sport> sports) {
        super(sports);
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void readAndPrint(String filename) {
        super.readAndPrint(filename);
    }

    @Override
    public void readJsonFile(String filename) {
        super.readJsonFile(filename);
    }

}
