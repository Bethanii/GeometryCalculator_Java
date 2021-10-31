import static org.junit.Assert.*;
import org.junit.Test;

public class coneTest
{
    Cone classUnderTest = new Cone();

    @Test 
    public void coneSlant() 
    {
        assertEquals(Math.sqrt(1 * 1 + 2 * 2), classUnderTest.slant(1,2), 0.0);
    }

    @Test 
    public void surfaceArea() 
    {
        assertEquals(Math.PI * 1 * (1 * Math.sqrt(2 * 2 + 1 * 1)), classUnderTest.surfaceArea(1,2), 0.0);
    }

    @Test 
    public void coneVolume() 
    {
        assertEquals(Math.PI * 1 * 1 *(2/3), classUnderTest.volume(1,2), 0.0);
    }

    @Test 
    public void conelatSurfaceArea() 
    {
        assertEquals(Math.PI * 1 * (Math.sqrt(2 * 2 + 1 * 1)), classUnderTest.latSurfaceArea(1,2), 0.0);
    }
}