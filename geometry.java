import java.lang.System;
import java.util.Scanner;

public class geometry
{
    public static void main(String[] args)
    {
        while (true) 
        {

        Scanner sc = new Scanner(System.in);

        Sphere sphere = new Sphere();
        Cone cone = new Cone();
        Cylinder cylinder = new Cylinder();

        System.out.println("Welcome to the my Geometry Program" +"\n" + "1. Sphere" +"\n" + "2. Cylinder"
        +"\n" + "3. Cone" + "\n" + "0. Quit");

        float input = (float)500.26897;
        System.out.println("Testing float: " + Math.round(input * 1000.0) / 1000.0);

        System.out.println("Please enter your selection: ");
        int selection = sc.nextInt();

        if (selection == 0)
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