
public class tester{
    public static void main(String[] args){
        System.out.println(averageBamboo());
    }

    public static double averageBamboo(){
    double[] eatenBambooArray = {43.1,40.3,45.2,44.6,46.3,43.5,49.1,42.5,46.7,47.1}; //example values
        double minvalue = Integer.MAX_VALUE;
        double maxValue = Integer.MIN_VALUE;
        double summedValues = 0;

        for(int i=0;i<eatenBambooArray.length;i++){
            if(eatenBambooArray[i]>maxValue){
                maxValue=eatenBambooArray[i];
            }
            if(eatenBambooArray[i]<minvalue){
                minvalue=eatenBambooArray[i];
            }
            summedValues+=eatenBambooArray[i];
        }
        summedValues -=(maxValue+minvalue);
        double average = summedValues/(eatenBambooArray.length-2);
        return average;}
    
    public static int integerArrayCreator(){
        int[] firstFiveEvens  = new int[5];
        int product = 1;
        for (int i =1; i<11;i++){
            if((i%2==0)){
                firstFiveEvens[(i/2)-1]=i;
                product *= firstFiveEvens[(i/2)-1];
            }
        }
        return(product);
        
}
    public static void DifferenceArrayCreator(){
    double[] a1 = {1.2, 2.3, 3.4, 8.5, 5.6};
    double[] a2 = {1.0, 4.0, 3.0, 4.0, 10.0};
    double[] differenceArray = new double[a1.length];
    for(int i=0;i<a1.length;i++){
        differenceArray[i]= Math.round((a1[i]-a2[i])*100.0)/100.0;
        System.out.println(differenceArray[i]);
    }
}

public static void rectangleComparer(){
    int side1=10; //Test variables
    int side2=8; //Test variables

    int side1rectangle2=5; //Test variables
    int side2rectangle2=4; //Test variables
    
    if(((double)side1)/side1rectangle2 ==((double)side2)/side2rectangle2){
        System.out.println("The given rectangles are similar.");
    }
    else{
        System.out.println("The given rectangles are not similar.");
    }

}
}