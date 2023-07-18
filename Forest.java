// Made on April 23, 2023 by Daniel boktor to extend the Terrain class.
public class Forest extends Terrain {
    private int numTrees;
    public Forest(int n, int l, int w){
        super(l,w);
        numTrees=n;
    }
    public void printAttributes(){
        System.out.println("This forest has dimensions of: " + this.length + "x" + this.width +", and "+ this.numTrees+ " many trees");
    }
}
