package com.function;

import java.sql.PreparedStatement;
import java.util.Arrays;

public class MassSorter {
    public static int func(int[] mass) {
        if (mass.length == 0) {
            return 0;
        } else {
            Arrays.sort(mass);
        }
        return mass[0] + mass[1];
    }

//    public static int func(int [] mass){
//        try {
//            Arrays.sort(mass);
//        } catch (Exception e) {
//            throw new NullPointerException(e.getMessage());
//        }
//        return mass[0] + mass[1];
//    }
}