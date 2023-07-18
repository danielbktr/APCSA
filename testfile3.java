import java.util.ArrayList;

public class testfile3 {
    public static void main(String args[]){
      ArrayList<Integer> numList = new ArrayList<Integer>(); 
      numList.add(3);
      numList.add(2);
      numList.add(1);
      numList.add(1,0);
      numList.set(0,2);
      
      System.out.println(numList);
    }
}