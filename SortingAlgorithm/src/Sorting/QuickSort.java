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
public class QuickSort {
    
    QuickSort() {
	
    }
    public void sort(int a[]) {
        int lo = 0;
        int hi = a.length - 1;
        quicksort(a, lo, hi);
    }
    public void quicksort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int p = partition(a, lo, hi);
            quicksort(a, lo, p - 1);
            quicksort(a, p + 1, hi);
        }
    }
     public int partition(int[] a, int lo,int hi) {
         int pivot = a[hi];
         int swap = lo;
         for (int c = lo; c < hi ; c++) {
             if (a[c] <= pivot) {
                 int temp = a[swap];
                 a[swap] = a[c];  
                 a[c] = temp;
                 swap++;
             }
         }
         int temp = a[swap];
         a[swap] = a[hi];
         a[hi] = temp;
         return swap;
     }
}
	
