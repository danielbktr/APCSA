// Made on April 23, 2023 by Daniel boktor to extend the Terrain class.
public class Desert extends Terrain {
    private int tempInF;
    private int windsInMPH;

    public Desert(int s,int t, int l, int w){
        super(l,w);
        tempInF = t;
        windsInMPH=s;
    }
    public void printAttributes(){
        System.out.println("This desert has dimensions of: " + this.length + "x" + this.width +" at a temperature of " + this.tempInF+" degrees Farenheit, and with winds of " + this. windsInMPH + " miles per hour.");
    }
}
