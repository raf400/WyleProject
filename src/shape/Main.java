
package shape;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the geometrical shape to get Area and Perimeter:");
        System.out.println("(options are:Circle,Ellipse,Rectangle,Square and Triangle)");
        String select = input.next();
        

        switch (select.trim().toLowerCase()) {
            case "circle":
                shapetests.TestCircle.test();
            case "ellipse":
                shapetests.TestEllipse.test();
            case "rectangle":
                shapetests.TestRectangle.test();
            case "square":
                shapetests.TestSquare.test();
            case "triangle":
                shapetests.TestTriangle.test();
            default:
                System.out.println("Selection must be from one of the options above.");

        }

    }
}
