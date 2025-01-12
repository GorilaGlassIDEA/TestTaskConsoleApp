package org.example;


import org.example.flags.AllFlagStrategy;
import org.example.flags.content.AddNewInfoContentStrategy;
import org.example.logical.IntegerSortVar;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            if(args[i].equals("-o")){
//                AllFlagStrategy allFlagStrategy = new AllFlagStrategy(args[i+1]);
//                allFlagStrategy.setContentStrategy(new AddNewInfoContentStrategy());
//                // Correct working setContentStrategy();
//            }
//        }
        System.out.println(IntegerSortVar.sortContentToFile(" 21323132   \nsajkfks \n 123.0   "));


    }
}