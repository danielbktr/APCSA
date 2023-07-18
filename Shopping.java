import java.util.ArrayList;

public class Shopping{

    /*there may be other instance variables, constructors and methods not shown*/

    public static final int REORDER=4;

    public ArrayList <Grocery> addGroc(Grocery[] groc){
        ArrayList<Grocery> tempArr = new ArrayList<Grocery>();
        for(int i=0;i<groc.length;i++){
            if(groc[i].getQtyOnHand<Shopping.REORDER){
                tempArr.add(groc[i]);
            }
        }
        return tempArr;
    }

    public int totalQty(ArrayList <Grocery> shoppingList, String c){
        int totalQty =0;
        for(int i=0;i<shoppingList.size();i++){
            if(shoppingList.get(i).getCategory().equals(c)){
                totalQty += shoppingList.get(i).getQtyOnHand();
            }
        }
        return totalQty;
    }

}