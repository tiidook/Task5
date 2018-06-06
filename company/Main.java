package com.company;

import java.io.EOFException;
import java.util.Arrays;

public class Main {

    public static final int EXAMPLENUMBER = 10;

    public static void main(String[] args) throws EOFException {

        int min = -10;
        int max = 10;

        double[] array = new double[EXAMPLENUMBER];

        InitLogic.init(array, min, max);


        System.out.println(Arrays.toString(array));

        double maximum = ArrayLogic.getMax(array);
        double minimum = ArrayLogic.getMin(array);

        System.out.println("Max = " + maximum);
        System.out.println("Min = " + minimum);

        double arithmetical = ArrayLogic.getArithmetical(array);
        double geometrical = ArrayLogic.getGeometrical(array);

        System.out.println("Arithmetical " + arithmetical);
        System.out.println("Geometrical " + geometrical);

        boolean checkIncreasing = ArrayLogic.checkSortIncreasing(array);
        boolean checkDecrease = ArrayLogic.checkSortDecrease(array);
        boolean checkIncreasingAd = ArrayLogic.checkSortIncreaseAdditional(array);

        System.out.println("Is sorted increasing? " + checkIncreasing);
        System.out.println("Is sorted decrease? " + checkDecrease);
        System.out.println("Is sorted increasing? " + checkIncreasingAd);

        int localmin = ArrayLogic.checkLocalmin(array);
        int localmax = ArrayLogic.checkLocalmax(array);



        System.out.println("Local min is " + localmin);
        System.out.println("Local max is " + localmax);

        ArrayLogic.reverse(array);
        System.out.println(Arrays.toString(array));



    }
}
