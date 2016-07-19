/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapetests;

import java.util.Scanner;
import shape.Circle;

/**
 *
 * @author rafael
 */
public class TestCircle {
    public TestCircle() {
    }

    public static void test() {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter radius of the Circle");
        double radius = input.nextDouble();
        
        Circle circle = new Circle(radius);

        System.out.println("The Circle Radius is: "
                + circle.getRadius() );

        System.out.println("The Circle's Area is " + circle.getArea());
        System.out.println("The Circle's Circumference is " + circle.getPerimeter());

    }

}
