import static org.junit.Assert.*;
import org.junit.Test;

public class sphereTest
{

    Sphere classUnderTest = new Sphere();
    
    @Test 
    public void sphereVolume() 
    {
        assertEquals((4/3)* Math.PI * 1 * 1 * 1, classUnderTest.volume(1), 0.0);
    }
    
    @Test 
    public void sphereSurfaceArea() 
    {
        assertEquals(4 * Math.PI * 2 * 2, classUnderTest.surfaceArea(2), 0.0);
    }
}