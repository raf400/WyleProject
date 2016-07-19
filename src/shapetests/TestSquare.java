
package shapetests;

import java.util.Scanner;
import shape.Square;

/**
 *
 * @author rafael
 */
public class TestSquare {
    
    public TestSquare(){};
    public static void test() {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter the side of the Square");
        double side = input.nextDouble();
        
        
        Square square = new Square(side);

        System.out.println("The Square's Side is "+square.getSide());

        System.out.println("The Square's Area is " + square.getArea());
        System.out.println("The Square's Perimeter is " + square.getPerimeter());

    }
    
}
