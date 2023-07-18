import java.util.ArrayList;

public class CoinCollection{
    private ArrayList<Coin> coins; //collection of coins
    //precondition: parallel arrays of all the same length
    //write the constructor of CoinCollection for part A
    
    public CoinCollection(int[] years, double[] values, String[] countries){
        for(int i = 0;i<values.length;i++){
            Coin tempCoin = new Coin(years[i], values[i], countries[i]);
            coins.add(tempCoin);
        }
    }
    
    public boolean isRare(int year){
        for(int i=0;i<this.coins.size();i++){
            if(coins.get(i).getYear()>year){
                return false;
            }
        }
        return true;
    }
    //there may be other constructors and methods not shown
}