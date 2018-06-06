package com.company;

import java.util.Random;

public class InitLogic {

    public static void init(double[] array, double min, double max){

        for (int i = 0; i < array.length; i++){
            array[i] = Math.random() * (max - min) + min;
        }
    }
}
