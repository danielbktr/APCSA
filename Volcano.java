// Made on April 23, 2023 by Daniel boktor to extend the Terrain class.
public class Volcano extends Terrain {
    private int tempInF;
    public Volcano(int t, int l, int w){
        super(l,w);
        tempInF = t;
    }
    public void printAttributes(){
        System.out.println("This volcano has dimensions of: " + this.length + "x" + this.width +" at a temperature of " + this.tempInF+" degrees Farenheit");
    }
}
