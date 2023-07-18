// Made by Daniel Boktor on June 11, 2023.
// This class is used by the pastasauceTester class to demonstrate the use of different sorting algorithms.
public class PastaSauce {
    private String name;
    private double price;
    private int quantity;
    private int productNumber;
    
    public PastaSauce(String n, double p, int q,int pn){
        name = n;
        price = p;
        quantity = q;
        productNumber = pn;
    }

    public String toString(){
        return ("Name: "+this.name+", Price: "+ Math.round(this.price*100.00)/100.00 + ", Quantity: "+ this.quantity+ ", Product Number: "+ this.productNumber);
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }
    public int getProductNumber(){
        return this.productNumber;
    }
    public String getName(){
        return this.name;
    }
}
