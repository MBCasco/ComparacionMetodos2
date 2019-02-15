package com.company;

import java.util.Random;
/*
AUTORA>>>> MEYLIN BACA
 */


public class Main {

    public static void main(String[] args) {


        int n = 300;
        int[] rArray = new int[n];


       /*
       ESTE ES EL TIEMPO BUBBLE SORT
        */
        System.out.println("BIENVENDIDO :) ");
        System.out.println("");
        System.out.println("Este es el TIEMPO bubble sort");
        System.out.println("");
        while (n < 100000) {


            long starTime = System.nanoTime();
            bubbleSort(rArray);
            long endTime = System.nanoTime();
            long deltaTime = endTime - starTime;

            System.out.println(" -Indice:" + n + "    Tiempo en nano segundo: " + deltaTime);
            n += n;
        }
       /*
       LLENAR BUBBLE SORT
        */
        Random random = new Random();
        LectorTeclado lt = new LectorTeclado();
        System.out.println("");
        System.out.println(" ");
        int t = lt.leerEntero("Elija el tamano que desea para el arreglo de bubble sort " +
                "  *Este se le llenara automaticamente con numeros al azar :", "INGRESE UN ENTERO!");

        int[] nArray = new int[t];
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = random.nextInt(300);
        }

        bubbleSort(nArray);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.print("ESTE ES EL BUBBLE SORT:");
        System.out.println("");
        for (int i = 0; i < nArray.length; i++) {

            System.out.println(nArray[i] + "");

        }
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("");

       /*
       TIEMPO MERGESORT
        */

        System.out.print("Este es el TIEMPO merge sort: ");
        System.out.println("");

        int u = 300;
        int[] eArray = new int[u];
        while (u < 100000) {


            long starTime = System.nanoTime();
            mergeSort(eArray);
            long endTime = System.nanoTime();
            long deltaTime = endTime - starTime;

            System.out.println("  -Indice:" + u + "       Tiempo en nano segundo:" + deltaTime);
            u += u;
        }

        System.out.println("");
        System.out.println("");




        /*
        LLENAR EL MERGESORT
         */

        System.out.println("");
        System.out.println("");


        System.out.println(" ");
        int o = lt.leerEntero("Elija el tamaño que desea para el arreglo de mergeSort " +
                " * Este se le llenara automaticamente con numeros al azar :", "INGRESE UN ENTERO!");

        int[] mArray = new int[o];
        for (int i = 0; i < mArray.length; i++) {
            mArray[i] = random.nextInt(300);

        }

        mArray = mergeSort(mArray);

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.print("ESTE ES EL MERGESORT");
        System.out.println("");


        for (int i = 0; i < mArray.length; i++) {

            System.out.println(mArray[i]+"");


        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("");

    }


    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr) {
        //caso base.
        if (arr.length <= 1) {
            return arr;
        }
        // caso recursivo.

        int medio = arr.length / 2;

        int[] inferior = new int[medio];
        int[] superior = new int[arr.length - medio];
        for (int i = 0; i < medio; i++) {
            inferior[i] = arr[i];
        }

        for (int i = 0; i < superior.length; i++) {
            superior[i] = arr[i + inferior.length];
        }
        return merge(mergeSort(inferior), mergeSort(superior));
    }


    public static int[] merge(int[] a, int[] b) {
        int[] retval = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < a.length && k < b.length) {
            if (a[j] < b[k]) {
                retval[i++] = a[j++];
            } else {
                retval[i++] = b[k++];
            }
        }

        while (j < a.length) {
            retval[i++] = a[j++];
        }

        while (k < b.length) {
            retval[i++] = b[k++];
        }
        return retval;

    }

}
