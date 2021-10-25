import java.lang.Math;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;
import java.util.function.*;

public class Cone
{
    //method to get cone surface area
    public double surfaceArea(double rad, double hi)
    {
        double surfaceArea = Math.PI * rad * (rad + Math.sqrt(hi * hi) + (Math.pow(rad, 2)));
        return surfaceArea;
    }

    //method to get cone volume
    public double volume (double rad, double hi)
    {
        double volume = Math.round(Math.PI * Math.sqrt(rad) * hi/3);
        return volume;
    }

    //method to get cone lateral surface area
    public double latSurfaceArea(double rad, double hi)
    {
        double latSurfaceArea = Math.round(Math.PI * rad * slant(rad, hi));
        return latSurfaceArea;
    }

    //method to get cone slant
    public double slant(double rad, double hi)
    {
    double slant = Math.round(Math.sqrt(rad) + hi * hi);
    return slant;
    }

    //method to get user info and output answers
    public void prompt()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        System.out.println("----------------------------------------------------------" + "\n" +
        "PYTHON PROGRAM TO FIND VOLUME & SURFACE AREA OF A CONE" + "\n" +
         "----------------------------------------------------------");

         System.out.println("Please enter the Radius of a cone: ");
         double radius = sc.nextDouble();
         System.out.println("Please enter the Height of a cone: ");
         double height = sc.nextDouble();

         System.out.println("\nLength of a Side (Slant) of a Cone = " + slant(radius, height));
         System.out.println("The Surface Area of a Cone = " + surfaceArea(radius, height));
         System.out.println("The Volume of a Cone = " + volume(radius, height));
         System.out.println("The Lateral Surface Area of a Cone = " + latSurfaceArea(radius, height) + "\n");
    }
}