import java.lang.Math;
public class Circle
{
    private double radius;

    // postcondition: the instance variable is initialized
    public Circle(double rad)
    {
        radius = rad;
    }

    // postcondition: the instance variable is initialized
    public Circle(int diameter)
    {
        radius = (diameter/2);
    }

    // postcondition: returns the arcLength of a circle with radius equal to this
    // circle's radius, according to the formula: (PI / 180) * r * deg,
    // where PI is the value of pi (3.1415…), r is the radius of the circle,
    // and deg is the angle in degrees passed as the parameter.
    // Use the Math class constant to represent the value of pi.
    public double arcLength(double degree)
    {
        double lengthArc = 0.0;
        lengthArc = (((Math.PI)/180)* radius * degree);
        return lengthArc;
    }

    // There may be other instance variables, constructors,
    // and methods that are not shown.

}