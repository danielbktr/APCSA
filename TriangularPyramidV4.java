public class TriangularPyramidV4 extends SquarePyramidV4{
    private int sideLength;
    private int height;
    public TriangularPyramidV4(int s, int h){
        super(s,h);
        sideLength=s;
        height=h;
    }
    public int getSideLength(){
        return sideLength;
    }
    public int getHeight(){
        return this.height;
    }
    public String toString(){
        return (this.sideLength+ " X " + this.sideLength+ " X " +this.height); 
    }
}