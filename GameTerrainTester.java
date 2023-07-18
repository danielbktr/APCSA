// Made by Daniel Boktor on April 23, 2023 to test different terrain classes.
public class GameTerrainTester {
    public static void main(String args[]){
        Mountain tempMountain = new Mountain(12,12,12);
        WinterMountain tempWinterMountain = new WinterMountain(78,12,12,12);
        Forest tempForest= new Forest(12,12,12);
        Volcano tempVolcano = new Volcano(300,12,12);
        Desert tempDesert = new Desert(100,120,12,12);

        tempMountain.printAttributes();
        tempWinterMountain.printAttributesWinter();
        tempForest.printAttributes();
        tempVolcano.printAttributes();
        tempDesert.printAttributes();

    }   
}