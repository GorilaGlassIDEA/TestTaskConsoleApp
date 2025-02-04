package org.example;

import org.example.file.FileWorkerUtil;
import org.example.flag.model.abstracts.AllFileWithParams;

public class Main {
    public static void main(String[] args) {

        AllFileWithParams allFileWithParams = new AllFileWithParams(new FileWorkerUtil(), args);
        allFileWithParams.move();
    }
}