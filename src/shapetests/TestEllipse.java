
package shapetests;

import java.util.Scanner;
import shape.Ellipse;

/**
 *
 * @author rafael
 */
public class TestEllipse {

    public TestEllipse() {
    }

    public static void test() {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter the radius of the y axis and radius of X axis of the Ellipse");
        double radiusY = input.nextDouble();
        double radiusX = input.nextDouble();

        Ellipse ellipse = new Ellipse(radiusY, radiusX);

        System.out.println("The Ellipse's radius of axis Y is " + ellipse.getRadiusY() + " and \n"
                + "the radius of axis X is " + ellipse.getRadiusX());

        System.out.println("The Ellipse's Area is " + ellipse.getArea());
        System.out.println("The Ellipse's Circumference is(apprx.) " + ellipse.getPerimeter());
    }
}
