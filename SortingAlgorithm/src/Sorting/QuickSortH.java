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
public class QuickSortH {
    QuickSortH() {
        
    }
    public void sort(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        quicksort(a, lo, hi);
    }
    public void quicksort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int p = partition(a, lo, hi);
            quicksort(a, lo, p);
            quicksort(a, p + 1, hi);
        }
    }
    
    public int partition(int[] a, int lo, int hi) {
        int pivot = a[lo];
        int i = lo - 1;
        int j = hi + 1;
        while (true) {
            do {
                i++;
            } while (a[i] < pivot);
            
            do {
                j--;
            } while (a[j] > pivot);
            
            if (i >= j) {
                return j;
            }
            
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}

