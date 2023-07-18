import java.util.*;

// Made by Daniel Boktor on April 25, 2023 to be used with the PrimeNumberFinder class.
public class PrimeNumberFinderTester {
    public static void main(String args[]){
        Scanner inputs = new Scanner(System.in);
        System.out.println("What is your upper limit (integers only)?");
        int upperBound = inputs.nextInt();
        System.out.println("What is your lower limit (integers only)?");
        int lowerBound = inputs.nextInt();
        PrimeNumberFinder temp = new PrimeNumberFinder(upperBound,lowerBound);
        temp.findPrimes();
        temp.printPrimes();
        inputs.close();
    }
}
