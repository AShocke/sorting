/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author isosceles
 */
public class SortingAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cSum = 0;
        int gSum = 0;
        int qSum = 0;
        int qHSum = 0;
        int iter = 20;
        int arrSize = 10000000;
        for (int i = 0; i < iter; i++) {
            int[] a = new int[arrSize];
            int[] b = new int[arrSize];
            int[] c = new int[arrSize];
            int[] d = new int[arrSize];

            for (int x = 0; x < arrSize; x++) {
                a[x] = (int) (Math.random() * arrSize);
                b[x] = a[x];
                c[x] = a[x];
                d[x] = a[x];
            }

            CombSort cSorter = new CombSort();
            long start = System.currentTimeMillis();
            cSorter.sort(a);
            long end = System.currentTimeMillis();
            cSum += (end - start);
            System.out.println("combsort done in approx. " + ((end - start))
                    + " milliseconds");
            /**
             * n log(n)
             * QUICKSORT
             * 
             */
            //int[] tinyTest = { 3 , 4 , 1 , 2 };
            QuickSort qSorter = new QuickSort();
            start = System.currentTimeMillis();
            qSorter.sort(c);
            end = System.currentTimeMillis();
            System.out.println("Quicksort(Lomuto Scheme) done in approx. " + ((end - start))
                    + " milliseconds");
            qSum += (end - start);

            //int[] tinyTest = { 3 , 4 , 1 , 2 };
            QuickSortH qHSorter = new QuickSortH();
            start = System.currentTimeMillis();
            qHSorter.sort(b);
            end = System.currentTimeMillis();
            System.out.println("Quicksort(Hoares Scheme) done in approx. " + ((end - start))
                    + " milliseconds");
            qHSum += (end - start);
            System.out.println();
            /**
             * n^2
             * GnomeSort
             */
            /*
            GnomeSort gSorter = new GnomeSort();
            start = System.currentTimeMillis();
            gSorter.sort(d);
            end = System.currentTimeMillis();
            System.out.println("Quicksort(Hoares Scheme) done in approx. " + ((end - start))
                    + " milliseconds");
            gSum += (end - start);
            System.out.println(); */

        }
        System.out.println("Ccombsort avg: " + cSum / iter + " milliseconds");
        System.out.println("Quicksort(Lomuto Scheme) avg: " + qSum / iter + " milliseconds");
        System.out.println("Quicksort(Hoares Scheme) avg: " + qHSum / iter + " milliseconds");
       // System.out.println("Gnomesort avg: " + gSum / iter + " milliseconds");

    }
}
