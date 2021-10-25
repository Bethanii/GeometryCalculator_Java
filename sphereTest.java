import static org.junit.Assert.*;
import org.junit.Test;

public class sphereTest
{
    @Test
    public void surfAreaTest_Pass()
    {
        //Passing sphere surface area test
        Sphere sphere = new Sphere();
        double result = sphere.surfaceArea(2);
        assertEquals(50.26548245743669, result, 0);
    }
    //failing sphere surface area test
    @Test
    public void surfAreaTest_Fail()
    {
        //Passing sphere surface area test
        Sphere sphere = new Sphere();
        double result = sphere.surfaceArea(2);
        assertEquals(48, result, 0);
    }
}