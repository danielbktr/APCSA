
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * Daniel boktor
 * April 23, 2023
 */
import java.util.*;
public class ShapesTesterV4
{
    public static void main(String []args)
    {
        RectangleV4 one = new RectangleV4(5, 20);
        RectangleV4 two = new BoxV4(4, 4, 4);
        RectangleV4 three = new SquarePyramidV4(4,8);
        RectangleV4 four = new CubeV4(4);
        RectangleV4 five = new TriangularPyramidV4(4,8);

        //Print all shapes
        ArrayList<RectangleV4> shapes = new ArrayList<RectangleV4>();

        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        

        System.out.println("Rectangle: "+shapes.get(0).toString());
        System.out.println("Box: "+shapes.get(1).toString());
        System.out.println("Square Pyramid: "+shapes.get(2).toString());
        System.out.println("Cube: "+shapes.get(3).toString());
        System.out.println("Triangular Pyramid: "+shapes.get(4).toString());
        System.out.println("Equality Comparisons");
        System.out.println("Box: "+shapes.get(1).toString()+ shapes.get(3).equals(shapes.get(1))+ "Cube "+ shapes.get(3).toString());
        System.out.println("Triangular Pyramid: "+shapes.get(4).toString()+ shapes.get(4).equals(shapes.get(3))+ "Cube "+ shapes.get(3).toString());
    }

    
    public static void showEffectBoth(RectangleV4 r)
    {
        System.out.println(r);
    }

}
