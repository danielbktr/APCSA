import java.util.ArrayList;

public class testfile2{
    public static void main(String args[]){
Integer[] tmep = {2,3,4,3,3,4,4,5,4,3,2,1};
ArrayList<Integer> arr = new ArrayList<Integer>();
for(int i=0;i<tmep.length;i++){
    arr.add(tmep[i]);
}
removeValue(arr, 4);
    for(int i=0;i<arr.size();i++){
    System.out.print(arr.get(i));
}

    }
public static void removeValue(ArrayList < Integer > aList, int val)
{
   int i;

   for(i = 0; i < aList.size(); i++)
   {
      if(aList.get(i) == val)
      {
         aList.remove(i);
      }
   }
}

}
   