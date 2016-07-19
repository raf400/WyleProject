
package shapetests;

import java.util.Scanner;
import shape.Rectangle;

/**
 *
 * @author rafael
 */
public class TestRectangle {
    
    public TestRectangle(){}
    public static void test() {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter the length and width of the Rectangle");
        double length = input.nextDouble();
        double width = input.nextDouble();
        
        Rectangle rectangle = new Rectangle(length,width);

        System.out.println(
                "The Rectangle's Length is "+rectangle.getLength()+" and \n"
                        + "the Width is "+rectangle.getWidth());

        System.out.println("The Rectangle's Area is " + rectangle.getArea());
        System.out.println("The Rectangle's Perimeter is " + rectangle.getPerimeter());

    }
}
