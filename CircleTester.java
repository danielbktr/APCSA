// Made on April 23,2023 by Daniel Boktor, This program tests the various shape classes.
import java.util.ArrayList;

public class CircleTester {
    public static void main(String args[]){
    Circle2 tempCircle2 = new Circle2(23, 0, 2);
    Cylinder2 tempCylinder2 = new Cylinder2(6, 0, 2, 2);
    OvalCylinder2 tempOvalCylinder2 = new OvalCylinder2(0, 9, 2, 4, 2);
    Oval2 tempOval2 = new Oval2(0, 15, 2, 4);

    ArrayList<Circle2> temp = new ArrayList<Circle2>();
    temp.add(tempCircle2); 
    temp.add(tempCylinder2); 
    temp.add(tempOval2); 
    temp.add(tempOvalCylinder2); 

    for (int i=0; i<temp.size();i++){
        System.out.print("For this "+ temp.get(i).getName()+ ", the ");
        System.out.println(showCenter(temp.get(i))+".");
    }
}
public static String showCenter(Circle2 shape){
    return shape.getCenter();
}
}
