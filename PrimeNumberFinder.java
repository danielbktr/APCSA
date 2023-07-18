import java.util.ArrayList;

// Made by Daniel Boktor on April 25, 2023 to find all prime numbers within a given range.
public class PrimeNumberFinder {
    private int lowerBound,upperBound;
    private ArrayList<Integer> primeList = new ArrayList<Integer>();
    public PrimeNumberFinder(int u, int l){
        this.upperBound=u;
        this.lowerBound=l;
    }

    public ArrayList<Integer> findPrimes(){
        Start:    
        for (int i=lowerBound;i<(this.upperBound);i++){
            int current =2;
            while(current<=i/2){
                if(i%current==0){
                    continue Start;
                }
                current++;
                }
            primeList.add(i);
            }
            
            return primeList;
    }

    public void printPrimes(){
        System.out.print("The prime numbers within your range are: ");
        for(int i:this.primeList){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("There are "+ this.primeList.size() + " within your list.");
    }
}
