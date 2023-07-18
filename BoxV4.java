/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * Daniel Boktor
 * April 23, 2023
 */
public class BoxV4 extends RectangleV4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public BoxV4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

}
