// Program made by Daniel Boktor on April 20,2023
// This program is a tester fo rthe Catapult class that uses 
// two dimensional arrays in order to keep the data organized and make 
// working with the data easy and understandable.
public class CatapultTester {
    public static void main(String args[]){

        double[][] dataArray = new double[6][6];
        int velocity=0;
        for(int r=0; r<dataArray.length; r++) {
            velocity = 20+5*r;
            for(int c=0;c<dataArray.length; c++)
            {
                int theta = 25+5*c;
                Catapult temp = new Catapult(velocity, theta);
                dataArray[r][c] = temp.calcDistance();
            }
        }

        System.out.println("            Projectile Distance(ft)");
        System.out.println("==========================================================================================");
        System.out.println("MPH   25Deg   30Deg       35Deg   40Deg       45Deg   50Deg");
        for(int r=0; r<dataArray.length; r++) {
            System.out.print(("\n"+(20+5*r))+"  ");
            for(int c=0;c<dataArray.length; c++)
            {
                System.out.print(String.format("%6.2f", dataArray[r][c])+"    ");
            }
        }
    }
}
