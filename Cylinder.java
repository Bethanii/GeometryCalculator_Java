import java.lang.Math;
import java.util.Scanner;
import java.util.function.*;

public class Cylinder 
{
    //method to find cylinder surface area
    public float surfaceArea(int rad, int hgt)
    {
    double surfaceArea = 2 * Math.PI * rad * hgt + 2 * Math.PI * Math.pow(rad, 2);
    return (float)surfaceArea;
    }

    //method to find cylinder volume
    public float volume(int rad, int hgt)
    {
        double volume = Math.PI * rad * rad * hgt;
        return (float)volume;
    }

    public float latSurfaceArea(int rad, int hgt)
    {
        double latSurfaceArea = 2 * Math.PI * rad * hgt;
        return (float)latSurfaceArea;
    } 

    public float baseSurfaceArea(int rad)
    {
        double baseSurfaceArea = Math.PI * rad * 2;
        return (float)baseSurfaceArea;
    } 

    public void prompt()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        System.out.println("----------------------------------------------------------");
        System.out.println("PYTHON PROGRAM TO FIND VOLUME & SURFACE AREA OF A CYLINDER");
        System.out.println("----------------------------------------------------------");

        System.out.println("Please Enter the radius: ");
        int radius = sc.nextInt();
        System.out.println("Please Enter the height: ");
        int height = sc.nextInt();

        System.out.println("\nThe Surface Area of a Cylinder: " + surfaceArea(radius, height));
        System.out.println("The Volume of a Cylinder = " + volume(radius, height));
        System.out.println("Lateral Surface Area of a Cylinder = " + latSurfaceArea(radius, height));
        System.out.println("Top OR Bottom Surface Area of a Cylinder: " + baseSurfaceArea(radius) + "\n");
    }
}