/*
Name: Bethany Hampton
File Name: Sphere.java 
Creation Date: 10/31/2021
Notes: There was no indication to have float results here (like with Cylinder), so I used double.
*/

//importing packages
import java.lang.Math;
import java.util.Scanner;

public class Sphere 
{
    //Sphere calculation methods

    //method to find sphere surface area
    public double surfaceArea(int rad)
    {
        //setting surfaceArea as a double to calculation
        double surfaceArea = Math.PI * 4 * Math.pow(rad, 2);
        //not void- returning surfaceArea as double
        return surfaceArea;
    }
    
    //method to find sphere volume
    public double volume(int rad)
    {
        //setting volume as a double to calculation
        double volume = (4/3)* Math.PI * rad * rad * rad;
        //not void- returning volume as double
        return volume;
    }
    
    //method to get user info and output results
    public void prompt()
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //printing title
        System.out.print("");
        System.out.println("----------------------------------------------------------");
        System.out.println("JAVA PROGRAM TO FIND VOLUME & SURFACE AREA OF A SPHERE");
        System.out.println("----------------------------------------------------------");

        //prompting user to enter radius
         System.out.println("Please enter the Radius of a sphere: ");

         //reading user input and setting to radius variable
         int radius = sc.nextInt();

         //displaying results
         //supplying surfaceArea method with user input (radius)
         System.out.println("\nThe Surface Area of a Sphere = " + surfaceArea(radius));

         //supplying volume method with user input (radius)
         System.out.println("The Volume of a Sphere = " + volume(radius));
    }
}