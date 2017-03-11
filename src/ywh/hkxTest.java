package ywh;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class hkxTest {

private static hkx calculator = new hkx();
    
    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @Test
    public void testEquilateral() {
        calculator.equilateral(4,4,4);
        assertEquals(true, calculator.getResult());
    }
    
    @Test
    public void testIsoscreles(){
    	calculator.isosceles(2, 2, 4);
    	assertEquals(true, calculator.getResult());
    }
    @Test
    public void testScalene() {
        calculator.scalene(2,2,2);
        assertEquals(9, calculator.getResult());
    }

    
}