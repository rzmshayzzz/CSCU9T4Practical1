package com.stir.cscu9t4practical1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CycleEntryTest {
    
    public CycleEntryTest() {
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

    @Test
    public void testGetName() {
        System.out.println("getName");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDay() {
        System.out.println("getDay");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel");
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "mountain");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYear() {
        System.out.println("getYear");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHour() {
        System.out.println("getHour");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMin() {
        System.out.println("getMin");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSec() {
        System.out.println("getSec");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt");
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTerrain() {
        System.out.println("getTerrain");
        TrainingSession instance = new CycleSession("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt");
        String expResult = "asphalt";
        String result = ((CycleSession) instance).getTerrain();
        assertEquals(expResult, result);
    }
}
