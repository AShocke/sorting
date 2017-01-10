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
public class GnomeSort {
    GnomeSort() {
        
    }
    
    public void sort(int[] a) {
        int pos = 0;
        while (pos < a.length) {
            if ((pos == 0) || (a[pos] >= a[pos - 1])) {
                pos++;
            }
            else {
                int temp = a[pos];
                a[pos] = a[pos - 1];
                a[pos - 1] = temp;
                
                pos--;
            }
        }
    }
        
}

