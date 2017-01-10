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
public class CombSort {
    
    CombSort() {
        
    }
    
    public void sort(int[] a)  {
        int gap = a.length;
        double shrink = 1.3;
        boolean sorted = false;
        
        while(!sorted) {
            gap = (int) (gap / shrink);
            if (gap > 1) {
                sorted = false;
            } 
            else {
                gap = 1;
                sorted = true;
            }
            for (int i = 0; i + gap < a.length; i++)  {
                if (a[i] > a[i+gap]) {
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] =temp;
                }
            }
        }
    }
}
