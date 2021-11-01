/*
Name: Bethany Hampton
File Name: Cone.java 
Creation Date: 10/31/2021
*/

//importing packages
import java.lang.Math;
import java.util.Scanner;


public class Cone
{
    //Cone calculation methods
    //method to find cone volume
    public double volume(int rad, int hgt)
    {
        //setting volume as a double to calculation
        //formula: V=πr2h/3
        double volume = Math.PI * rad * rad * (hgt / 3);
        //not void- returning volume as double
        return volume;
    }

    //method to find cone slant
    public double slant(int rad, int hgt)
    {
        //setting slant as a double to calculation
        //formula: l=squared(r2+h2)
        double slant = Math.sqrt(rad * rad + hgt * hgt);
        //not void- returning slant as double
        return slant;
    }

    //method to find cone surface area
    public double surfaceArea(int rad, int hgt)
    {
        //setting surfaceArea as a double to calculation
        //formula: A=πr(r+squared(h2+r2))
        double surfaceArea = Math.PI * rad * (rad * Math.sqrt(hgt * hgt + rad * rad));
        //not void- returning surface area as double
        return surfaceArea;
    }

    //method to find cone lateral surface area
    public double latSurfaceArea(int rad, int hgt)
    {
        //setting latSurfaceArea as a double to calculation
        //formula: AL=πr*squared(h2+r2)
        double latSurfaceArea = Math.PI * rad * (Math.sqrt(hgt * hgt + rad * rad));
        //not void- returning lateral surface area as double
        return latSurfaceArea;
    } 

    //method to get user info and output results
    public void prompt()
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in); 

        //printing title
        System.out.print("");
        System.out.println("----------------------------------------------------------");
        System.out.println("JAVA PROGRAM TO FIND VOLUME & SURFACE AREA OF A CONE");
        System.out.println("----------------------------------------------------------");

        //prompting user to enter radius
         System.out.println("Please enter the Radius of a cone: ");

         //reading user input and setting to radius variable
         int radius = sc.nextInt();

         //prompting user to enter height
         System.out.println("Please enter the Height of a cone: ");

         //reading user input and setting to height variable
         int height = sc.nextInt();

         //displaying results
         //supplying slant method with user inputs (radius and height)
         System.out.println("\nLength of a Side (Slant) of a Cone = " + slant(radius, height));

         //supplying surface area method with user inputs (radius and height)
         System.out.println("The Surface Area of a Cone = " + surfaceArea(radius, height));

         //supplying volume method with user inputs (radius and height)
         System.out.println("The Volume of a Cone = " + volume(radius, height));

         //supplying lateral surface area method with user inputs (radius and height)
         System.out.println("The Lateral Surface Area of a Cone = " + latSurfaceArea(radius, height) + "\n");
    }
}