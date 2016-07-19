
package shape;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/**
 *
 * @author rafael
 */
public class Ellipse implements Shape {

    private double radiusY = 1.0;
    private double radiusX = 1.0;

    public Ellipse() {
    }

    public Ellipse(double radiusY, double radiusX) {

        this.radiusY = radiusY;
        this.radiusX = radiusX;
    }

    public double getRadiusY() {
        return radiusY;
    }

    public double getRadiusX() {
        return radiusX;
    }

    public void setRadiusY(double radiusY) {
        this.radiusY = radiusY;
    }

    public void setRadiusX(double radiusX) {
        this.radiusX = radiusX;
    }

    @Override
    public double getPerimeter() {
        return ((2 *PI)*sqrt(((radiusY*radiusY) + (radiusX*radiusX))/2));
    }

    @Override
    public double getArea() {

        return (PI * (radiusY * radiusX));
    }

    @Override
    public String toString() {
        return " Ellipse: radius X = " + radiusX + " radius Y = " + radiusY;
    }
}
