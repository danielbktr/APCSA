// Made by Daniel Boktor on 12/31/22
// This program calculates the gravity constant on each planet taking the mass and radius of a planet as parameters. 
public class PlanetGravityv2{  

    public static double[]  calculateSurfaceGravity(double[] kMass, double[] kDiameter){
        double surfaceGravity[] = new double[9];
        double bigGConstant = Math.pow(6.67, -11);
        for (int i = 0; i< surfaceGravity.length; i++){
            surfaceGravity[i]= ((bigGConstant* kMass[i])/Math.pow(kDiameter[i]/2,2));
        }
        return surfaceGravity; 
    }

    public static void printTitle(){
        System.out.println("\t\t\t Planetary Data");
        System.out.println("Planet \t\t Diameter(km)\t\t Mass(kg)\t\t g (m/s^2)");
    }

    public static void printHeader(String[] names, double[] kMass, double[] surfaceGravity, double[] printDiameter){
        System.out.println(names + "  \t\t" + printDiameter + "\t\t" + kMass + "\t\t"+ surfaceGravity);
        System.out.printf("%32s\n","Planetary Data");
        System.out.printf("%-14s %-17s %7s %11s\n","Planet","Diameter (km)","Mass (kg)","g (m/s^2)");
        System.out.println("--------------------------------------------------");
        for(int i = 0; i < 9; i++){
            System.out.printf("%-14s %-17.0f %8.2e %13.2f\n",names[i], printDiameter[i], kMass[i], surfaceGravity[i]); 
        }
    }

    public static void main(String[] args){
    String[] names = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
    double[] printDiameter = { 4880000 , 12103600 , 12756300 , 6794000 , 142984000 , 120536000 , 51118000 , 49532000 , 2274000 };
    double[] kDiameter = { 4880 , 12103.6 , 12756.3 , 6794 , 142984 , 120536 , 51118 , 49532 , 2274 };
    double[] kMass = {3.30e23 , 4.869e24 , 5.972e24 , 6.4219e23 , 1.900e27 , 5.68e26 , 8.683e25 , 1.0247e26 , 1.27e22};
    double[] surfaceGravity = calculateSurfaceGravity(kMass, kDiameter);
    printHeader(names,kMass, surfaceGravity, printDiameter);
    printTitle();
        }   


}