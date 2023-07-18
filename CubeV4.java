// Made by Daniel Boktor on april 23 2023

public class CubeV4 extends BoxV4{
    private int sideLength;
    public CubeV4(int s){
        super(s,s,s);
        sideLength=s;
    }
    public int getSideLength(){
        return sideLength;
    }
    @Override
    public String toString(){
        return (this.sideLength + " X "+ this.sideLength+" X "+ this.sideLength); 
    }
}