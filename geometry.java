import java.lang.System;
import java.util.Scanner;

/*
        if selection == 0:
            break
        if selection == 1:
            sphere.prompt()
            break
        if selection == 2: 
            cylinder.prompt()
            break
        if selection == 3: 
            cone.prompt()
            break
        if selection == 4: 
            cube.prompt()
            break
        if selection == 5: 
            triangle.prompt()
            break
        if selection == 6: 
            trapezoid.prompt()
            break
        if selection == 7: 
            cuboid.prompt()
            break
        if selection == 8: 
            equilateralTriangle.prompt()
            break*/
public class main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Sphere sphere = new Sphere();
        Cone cone = new Cone();
        Cylinder cylinder = new Cylinder();

        System.out.println("Welcome to the my Geometry Program" +"\n" + "1. Sphere" +"\n" + "2. Cylinder"
        +"\n" + "3. Cone" + "\n" + "4. Triangle" + "\n" + "5. Cube" + "\n" + "6. Trapezoid" + "\n" +"7. Cuboid"
        + "\n" +"8. Equilateral Triangle" + "\n" + "0. Quit");

        System.out.println("Please enter your selection: ");
        int selection = sc.nextInt();

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
