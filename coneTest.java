/*
Name: Bethany Hampton
File Name: coneTest.java 
Creation Date: 10/31/2021
*/

//importing packages
import static org.junit.Assert.*;
import org.junit.Test;

public class coneTest
{
    //making new cone object
    //placed in global to avoid code repetition
    Cone classUnderTest = new Cone();

    @Test //setting coneSlant to run as test
    public void coneSlant() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone slant calculation manually inputting parameter
        assertEquals(Math.sqrt(1 * 1 + 2 * 2), classUnderTest.slant(1,2), 0.0);
    }

    @Test //setting coneSurfaceArea to run as test
    public void coneSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone surface area calculation manually inputting parameter
        assertEquals(Math.PI * 1 * (1 * Math.sqrt(2 * 2 + 1 * 1)), classUnderTest.surfaceArea(1,2), 0.0);
    }

    @Test //setting coneVolume to run as test
    public void coneVolume() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone volume calculation manually inputting parameters
        assertEquals(Math.PI * 1 * 1 *(2/3), classUnderTest.volume(1,2), 0.0);
    }

    @Test //setting cylinderLatSurfaceArea to run as test
    public void coneLatSurfaceArea() 
    {
        //comparing result to expected within positive 0.0 (delta end parameter)
        //expected = cone lateral surface area calculation manually inputting parameters
        assertEquals(Math.PI * 1 * (Math.sqrt(2 * 2 + 1 * 1)), classUnderTest.latSurfaceArea(1,2), 0.0);
    }
}