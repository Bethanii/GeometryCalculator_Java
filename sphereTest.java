/*
Name: Bethany Hampton
File Name: sphereTest.java 
Creation Date: 10/31/2021
*/

//importing packages
import static org.junit.Assert.*;
import org.junit.Test;

public class sphereTest
{
    //making new sphere object
    //placed this in global to avoid code repetition
    Sphere classUnderTest = new Sphere();
    
    @Test //setting sphereVolume to run as test
    public void sphereVolume() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = sphere volume calculation manually inputting parameter
        assertEquals((4/3)* Math.PI * 1 * 1 * 1, classUnderTest.volume(1), 0.0);
    }
    
    @Test //setting sphereSurfaceArea to run as test
    public void sphereSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = sphere volume calculation manually inputting parameter
        assertEquals(4 * Math.PI * 2 * 2, classUnderTest.surfaceArea(2), 0.0);
    }
}