package com.company;

import java.io.EOFException;

public class ArrayLogic {

    public static final int HALFARRAY = 2;

    public static double getMax(double[] array){
        double temp = array[0];

        for (double element: array){

            if (element > temp){
                temp = element;
            }
        }
        return temp;
    }

    public static double getMin(double[] array){
        double temp = array[0];

        for (double element: array){

            if (element < temp){
                temp = element;
            }
        }
        return temp;
    }

    public static double getArithmetical(double[] array){
        double arithmetical = 0;

        for (double element: array){
            arithmetical += element / array.length;
        }
        return arithmetical;
    }

    public static double getGeometrical(double[] array) throws EOFException{
        double geometrical = 1;//if geometrical exist it's always > 0

        for (double element: array){

            if (element > 0) {
                geometrical *= Math.pow(element, 1. / array.length);
            }
            else{
                return -1;
            }
        }
        return geometrical;
    }

    public static boolean checkSortIncreasing(double[] array){

        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++){

            if (array[j] < array[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSortIncreaseAdditional(double[] array){

        for (int i = 0, j = i + 1; j < array.length; i++, j++) {

            if (array[j] < array[i]) {
                return false;
            }
        }
        return true;
    }




    public static boolean checkSortDecrease(double[] array){

        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++){

                if (array[j] > array[i]){
                    return false;
                }

            }
        return true;
    }



    public static int checkLocalmin(double[] array) {
        double temp = array[0];

        for (int i = 1, j = i + 1; j < array.length; i++, j++) { //starts from 1 cause first and last elements can't be
                                                                //local min and max
                if (array[i] < temp && array[j] > array[i]) {
                    return i;
                }
            temp = array[i];
        }
        return -1;
    }

    public static int checkLocalmax(double[] array) {
        double temp = array[0];

        for (int i = 1, j = i + 1; j < array.length; i++, j++) {

                if (array[i] > temp && array[j] < array[i]) {
                    return i;
                }
            temp = array[i];
        }
        return -1;
    }

    public static void reverse(double[] array){

        for (int i = 0; i < array.length / HALFARRAY; i++){

            array[i] = array[i] + array[array.length - (i + 1)];
            array[array.length - (i + 1)] = array[i] - array[array.length - (i + 1)];
            array[i] = array[i] - array[array.length - (i + 1)];

        }
    }



}







