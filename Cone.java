import java.lang.Math;
import java.util.Scanner;
import java.util.function.*;

public class Cone
{
    //method to get cone surface area
    public double volume(int rad, int hgt)
    {
        double volume = Math.PI * rad * rad * (hgt / 3);
        return volume;
    }

    public double slant(int rad, int hgt)
    {
        double slant = Math.sqrt(rad * rad + hgt * hgt);
        return slant;
    }

    public double surfaceArea(int rad, int hgt)
    {
        double surfaceArea = Math.PI * rad * (rad * Math.sqrt(hgt * hgt + rad * rad));
        return surfaceArea;
    }

    public double latSurfaceArea(int rad, int hgt)
    {
        double latSurfaceArea = Math.PI * rad * (Math.sqrt(hgt * hgt + rad * rad));
        return latSurfaceArea;
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
         int radius = sc.nextInt();
         System.out.println("Please enter the Height of a cone: ");
         int height = sc.nextInt();

         System.out.println("\nLength of a Side (Slant) of a Cone = " + slant(radius, height));
         System.out.println("The Surface Area of a Cone = " + surfaceArea(radius, height));
         System.out.println("The Volume of a Cone = " + volume(radius, height));
         System.out.println("The Lateral Surface Area of a Cone = " + latSurfaceArea(radius, height) + "\n");
    }
}