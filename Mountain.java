// Made on April 23, 2023 by Daniel boktor to extend the Terrain class.
public class Mountain extends Terrain {
    protected int numMountains;
    public Mountain(int nm, int l, int w){
        super(l,w);
        numMountains= nm;
    }
    public void printAttributes(){
        System.out.println("This mountain range has dimensions of: " + this.length + "x" + this.width +", and "+ this. numMountains+ " many mountains");
    }
}
