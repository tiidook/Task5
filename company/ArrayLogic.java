package com.company;

public class ArrayLogic {

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

    public static boolean checkForMinus(double[] array){

        for (double element: array){

            if(element < 0){
                return false;
            }
        }
        return true;
    }

    public static double getGeometrical(double[] array){
        double geometrical = 1;//if geometrical exist it's always > 0

        if (checkForMinus(array)) {

            for (double element : array) {

                geometrical *= element;
            }
            return Math.pow(geometrical, 1. / array.length);
        }
        return -1;
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

        for (int i = 1; i < array.length - 1; i++) { //starts from 1 cause first and last elements can't be
                                                                //local min and max
            if (array[i] < array[i -1] && array[i + 1] > array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int checkLocalmax(double[] array) {

        for (int i = 1; i < array.length - 1; i++){

            if (array[i] > array[i - 1] && array[i + 1] < array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void reverse(double[] array){
        int halfArray = array.length / 2;

        for (int i = 0; i < halfArray; i++){

            array[i] = array[i] + array[array.length - (i + 1)];
            array[array.length - (i + 1)] = array[i] - array[array.length - (i + 1)];
            array[i] = array[i] - array[array.length - (i + 1)];

        }
    }
}







