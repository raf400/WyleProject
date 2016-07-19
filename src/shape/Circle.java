
package shape;

import static java.lang.Math.PI;

/**
 *
 * @author rafael
 */
public class Circle implements Shape {

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return ((2 * PI) * radius);
    }

    @Override
    public double getArea() {

        return (PI * (radius * radius));
    }

    @Override
    public String toString() {
        return " Circle: Radius = " + radius;
    }
}
