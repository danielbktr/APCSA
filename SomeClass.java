public class SomeClass {
    private int intnum1;
    private double doublenum1;
    public SomeClass(int b){
        intnum1=b;
    }
    public SomeClass(double b){
        doublenum1=b;
    }
    public SomeClass(int a, double b){
        intnum1=a;
        doublenum1=b;
    }

    public static int subtractThese(int num1, int num2){
        return (Math.abs(num1-num2));
    }
}
