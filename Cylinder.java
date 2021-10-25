import java.lang.Math;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;
import java.util.function.*;

public class Cylinder 
{
    //method to find cylinder surface area
    public double surfaceArea(double rad, double hi)
    {
    double surfaceArea = Math.round(2 * Math.PI * rad * hi) + 2 * Math.PI * Math.pow(rad, 2);
    return surfaceArea;
    }

    //method to find cylinder volume
    public double volume(double rad, double hi)
    {
    double volume = Math.round(Math.PI * Math.pow(rad, 2) * hi);
    return volume; 
    }

    //method to find cylinder lateral surface area
    public double latSurfaceArea(double rad, double hi)
    {
    double latSurfaceArea = Math.round(2 * Math.PI * rad * hi);
    return latSurfaceArea;
    }

    //method to find cylinder top or bottom area
    public double topOrBottom(double rad)
    {
    double topOrBottom = Math.round(Math.PI * Math.pow(rad, 2));
    return topOrBottom;
    }

    public void prompt()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        System.out.println("----------------------------------------------------------");
        System.out.println("PYTHON PROGRAM TO FIND VOLUME & SURFACE AREA OF A CYLINDER");
        System.out.println("----------------------------------------------------------");

        System.out.println("Please Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.println("Please Enter the height: ");
        double height = sc.nextDouble();

        System.out.println("\nThe Surface Area of a Cylinder: " + surfaceArea(radius, height));
        System.out.println("The Volume of a Cylinder = " + volume(radius, height));
        System.out.println("Lateral Surface Area of a Cylinder = " + latSurfaceArea(radius, height));
        System.out.println("Top OR Bottom Surface Area of a Cylinder: " + topOrBottom(radius) + "\n");
    }
}