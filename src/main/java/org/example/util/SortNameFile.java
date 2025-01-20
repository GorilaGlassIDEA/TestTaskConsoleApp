package org.example.util;

import java.util.*;

public class SortNameFile {

    public static String[] getFileName(String[] args){
        Set<String> fileName = new HashSet<>();
        for (String arg : args) {
            if (arg.contains(".txt")){
                fileName.add(arg);
            }
        }
        return fileName.toArray(new String[0]);
    }
}
