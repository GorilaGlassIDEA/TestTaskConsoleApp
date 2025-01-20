package org.example;


import org.example.flags.FlagsWorker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FlagsWorker flagsWorker = new FlagsWorker(args[0]);
            System.out.println(flagsWorker.getDoubleFile().getContentStringFromFile()); // Работает корректно

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}