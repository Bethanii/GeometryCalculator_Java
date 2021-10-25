import static org.junit.Assert.*;
import org.junit.Test;

public class coneTest
{
    @Test
    public void surfAreaTest()
    {
        //Passing cone surface area test
        Cone cone = new Cone();
        double result = cone.surfaceArea(1);
        assertEquals(6, result, 0);
    }
}