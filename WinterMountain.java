// Made on April 23, 2023 by Daniel boktor to extend the Terrain class.
public class WinterMountain extends Mountain {
    private int tempInF;
    public WinterMountain(int t, int nm, int l, int w){
        super(nm,l,w);
        tempInF = t;
    }
    public void printAttributesWinter(){
        System.out.println("This winter mountain has dimensions of: " + this.length + "x" + this.width +", and "+ numMountains+ " many mountains, all at a temperature of " + this.tempInF+" degrees Farenheit");
    }
}
