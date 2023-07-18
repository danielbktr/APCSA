//Made by daniel boktor on april 23, 2023
public class SquarePyramidV4 extends BoxV4 {
    private int sideLength;
    private int height;
    public SquarePyramidV4(int s, int h){
        super(s,s,h);
        sideLength=s;
        height =h;
    }
    public int getSideLength(){
        return sideLength;
    }
    public int getHeight(){
        return this.height;
    }
    public String toString(){
        return (this.sideLength+ " X " +this.height); 
    }
}
