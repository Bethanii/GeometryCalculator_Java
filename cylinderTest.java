import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Math;

public class cylinderTest
{
    Cylinder classUnderTest = new Cylinder();

    @Test 
    public void cylinderSurfaceArea() 
    {
        assertEquals((float)(2 * Math.PI * 1 * 2 + 2 * Math.PI * 1 * 1), classUnderTest.surfaceArea(1, 2), 0.0);
    }
    @Test 
    public void cylinderVolume() 
    {
        assertEquals((float)(Math.PI * 1 * 1 * 2), classUnderTest.volume(1, 2), 0.0);
    }

    @Test 
    public void cylinderlatSurfaceArea() 
    {
        assertEquals((float)(2 * Math.PI * 1 * 2), classUnderTest.latSurfaceArea(1, 2), 0.0);
    }

    @Test 
    public void baseSurfaceArea() 
    {
        assertEquals((float)(Math.PI * 1 * 2), classUnderTest.baseSurfaceArea(1), 0.0);
    }
}