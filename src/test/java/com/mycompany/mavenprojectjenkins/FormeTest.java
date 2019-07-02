/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectjenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usager
 */
public class FormeTest {
    
    public FormeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSuperficie method, of class Forme.
     */
    @Test
    public void testGetSuperficie() {
        System.out.println("getSuperficie");
        double a = 2.0;
        double expResult = 4.0;
        double result = Forme.getSuperficie(a);
        assertEquals(expResult, result, 0.01);
        
    }
    
}
