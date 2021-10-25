import static org.junit.Assert.*;
import org.junit.Test;

public class cylinderTest
{
    @Test
    public void surfAreaTest()
    {
        Cylinder cylinder = new Cylinder();
        //calling the static method (surfaceArea) using classname
        double result = cylinder.surfaceArea(1);
        //testing the expected versus the actual result
        assertEquals(6, result, 0);
    }
}