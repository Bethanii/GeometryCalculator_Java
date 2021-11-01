/*
Name: Bethany Hampton
File Name: Geometry.java 
Creation Date: 10/31/2021
*/

//importing packages
import java.lang.System;
import java.util.Scanner;

public class Geometry
{
    public static void main(String[] args)
    {
        while (true) 
        {
            //creating scanner object
            Scanner sc = new Scanner(System.in);

            //Object instantiation (because of non-static methods like prompt())
            Sphere sphere = new Sphere();
            Cone cone = new Cone();
            Cylinder cylinder = new Cylinder();

            //Displaying selection menu
            System.out.println("\n" + "1.  Sphere");
            System.out.println("2. Cylinder");
            System.out.println("3. Cone");
            System.out.println("0. Quit\n");

            //prompting user for selection choice
            System.out.println("Please enter your selection: ");

            //reading user input and setting to selection variable
            int selection = sc.nextInt();

            //looping through user selection to determine correct methods/calculations
            if (selection == 0) //breaks at 0 because the user would like to exit
            {
                break;
            }
            if (selection == 1)
            {
                sphere.prompt();
            }
            if (selection == 2)
            {
                cylinder.prompt();
            }
            if (selection == 3)
            {
                cone.prompt();
            }
        }
    }
}