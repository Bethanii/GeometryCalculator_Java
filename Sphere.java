import java.lang.Math;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;
import java.util.function.*;

public class Sphere 
{
    public double surfaceArea(double rad)
    {
    double surfaceArea = Math.PI * 4 * Math.pow(rad, 2);
    return surfaceArea;
    }
    
    public double volume(double rad)
    {
    double volume = (4/3)* Math.PI * rad * rad * rad;
    return volume;
    }
    
    public void prompt()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        System.out.println("----------------------------------------------------------" + "\n" +
        "PYTHON PROGRAM TO FIND THE VOLUME AND SURFACE AREA OF SPHERE" + "\n" +
         "----------------------------------------------------------");

         System.out.println("Please enter the Radius of a sphere: ");
         double radius = sc.nextDouble();
         System.out.println("Please enter the Height of a sphere: ");
         double height = sc.nextDouble();

         System.out.println("\nThe Surface Area of a Sphere = " + surfaceArea(radius));
         System.out.println("The Volume of a Sphere = " + volume(radius));
    }
}