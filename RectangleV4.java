    
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * Daniel Boktor 
 * April 23,2023
 */
public class RectangleV4{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public RectangleV4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "The rectangle's dimensions are " + length + " X " + width;
    }
    public String equals(RectangleV4 shape2){
        if(shape2.toString().equalsIgnoreCase(this.toString())){
            return("is the same size as ");
        }
        else{
            return("is NOT the same size as ");
        }
    }
}
