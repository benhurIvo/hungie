/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ivankayongo
 */
public class HungTest {
    
    public HungTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of runHung method, of class Hung.
     */
    @Test
    public void testRunHung() {
        System.out.println("runHung");
        double[][] arr = {{108,125,150},{150,135,175},{122,148,250}};
        int[] expResult = {2,1,0};
        int[] result = Hung.runHung(arr);
        assertArrayEquals(expResult, result);
    }
    
}
