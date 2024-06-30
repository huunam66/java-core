package org.example;

import org.example.Data.Reader;
import org.example.Data.ReaderInstance;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ReaderInstance();
        reader.readAndPrint("data.json");
    }
}