/*
Name: Bethany Hampton
File Name: cylinderTest.java 
Creation Date: 10/31/2021
Notes: Comments could likely be less repetitive but I wanted to make sure that I had enough detail.
*/

//importing packages
import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Math;

public class cylinderTest
{
    //making new cylinder object
    //placed this in global to avoid code repetition
    Cylinder classUnderTest = new Cylinder();

    @Test //setting cylinderSurfaceArea to run as test
    public void cylinderSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cylinder surface area calculation, manually inputting parameters
        //result = calling method surfaceArea
        assertEquals((float)(2 * Math.PI * 1 * 2 + 2 * Math.PI * 1 * 1), classUnderTest.surfaceArea(1, 2), 0.0);
    }
    @Test //setting cylinderVolume to run as test
    public void cylinderVolume() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cylinder volume calculation, manually inputting parameters
        //result = calling method volume
        assertEquals((float)(Math.PI * 1 * 1 * 2), classUnderTest.volume(1, 2), 0.0);
    }

    @Test //setting cylinderlatSurfaceArea to run as test
    public void cylinderLatSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cylinder lateral surface area calculation, manually inputting parameters
        //result = calling method latSurfaceArea
        assertEquals((float)(2 * Math.PI * 1 * 2), classUnderTest.latSurfaceArea(1, 2), 0.0);
    }

    @Test //setting cylinderBaseSurfaceArea to run as test
    public void cylinderBaseSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cylinder lateral surface area calculation, manually inputting parameters
        //result = calling method cylinderBaseSurfaceArea
        assertEquals((float)(Math.PI * 1 * 2), classUnderTest.baseSurfaceArea(1), 0.0);
    }
}