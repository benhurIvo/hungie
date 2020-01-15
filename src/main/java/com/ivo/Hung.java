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
//double[][] myArray = new double[cols][rows];
//
//// Two nested loops allow us to visit every spot in a 2D array.   
//// For every column I, visit every row J.
//for (int i = 0; i < cols; i++) {
//  for (int j = 0; j < rows; j++) {
//      int k = i+j+1;
//      
//    myArray[i][j] = k;
//  }
//}
double[][] myArray = {{108,125,150},{150,135,175},{122,148,250}};
System.out.println(Arrays.deepToString(myArray));
HungarianAlgorithm hr = new HungarianAlgorithm(myArray);
System.out.println(Arrays.toString(hr.execute()));
        
        
        
        
    }
}
