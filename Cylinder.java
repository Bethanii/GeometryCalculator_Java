/*
Name: Bethany Hampton
File Name: Cylinder.java 
Creation Date: 10/31/2021
Notes: The calculation methods here have float returns as indicated in instructions.
*/

//importing packages
import java.lang.Math;
import java.util.Scanner;

public class Cylinder 
{
    //Cylinder calculation methods

    //method to find cylinder surface area
    public float surfaceArea(int rad, int hgt)
    {
        double surfaceArea = 2 * Math.PI * rad * hgt + 2 * Math.PI * Math.pow(rad, 2);
        //not void- returning surfaceArea
        return (float)surfaceArea;
    }

    //method to find cylinder volume
    public float volume(int rad, int hgt)
    {
        //setting volume as a double to calculation
        double volume = Math.PI * rad * rad * hgt;
        //not void- returning volume as float
        return (float)volume;
    }

    //method to find cylinder lateral surface area
    public float latSurfaceArea(int rad, int hgt)
    {
        //setting latSurfaceArea as a double to calculation
        double latSurfaceArea = 2 * Math.PI * rad * hgt;
        //not void- returning lateral surface area as float
        return (float)latSurfaceArea;
    } 

    //method to find cylinder base surface area
    public float baseSurfaceArea(int rad)
    {
        //setting baseSurfaceArea as a double to calculation
        double baseSurfaceArea = Math.PI * rad * 2;
        //not void- returning base surface area as float
        return (float)baseSurfaceArea;
    } 

    //method to get user info and output results
    public void prompt()
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //printing title
        System.out.print("");
        System.out.println("----------------------------------------------------------");
        System.out.println("JAVA PROGRAM TO FIND VOLUME & SURFACE AREA OF A CYLINDER");
        System.out.println("----------------------------------------------------------");

        //prompting user to enter radius
        System.out.println("Please Enter the radius: ");
    
        //reading user input and setting to radius variable
        int radius = sc.nextInt();

        //prompting user to enter height
        System.out.println("Please Enter the height: ");

        //reading user input and setting to height variable
        int height = sc.nextInt();

        //displaying results
        //supplying surfaceArea method with user inputs (radius and height)
        System.out.println("\nThe Surface Area of a Cylinder: " + surfaceArea(radius, height));
        //supplying volume method with user inputs (radius and height)
        System.out.println("The Volume of a Cylinder = " + volume(radius, height));
        //supplying lateral surface area method with user inputs (radius and height)
        System.out.println("Lateral Surface Area of a Cylinder = " + latSurfaceArea(radius, height));
        //supplying base surface area (top or bottom area) method with user inputs (radius and height)
        System.out.println("Top OR Bottom Surface Area of a Cylinder: " + baseSurfaceArea(radius) + "\n");
    }
}