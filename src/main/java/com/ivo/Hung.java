/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivo;

import java.util.Arrays;

/**
 *
 * @author ivankayongo
 */
public class Hung {
    
    public static void main(String[] args) {
        int cols = 10;
int rows = 10;

double[][] myArray = {{108,125,150},{150,135,175},{122,148,250}};

        
        runHung(myArray);
        
        
    }

    public static int[] runHung(double[][] arr){
System.out.println(Arrays.deepToString(arr));
HungarianAlgorithm hr = new HungarianAlgorithm(arr);
System.out.println(Arrays.toString(hr.execute()));
return hr.execute();
    }
}
