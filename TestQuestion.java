public class TestQuestion {
    public static int stringToInt(String str){
        int convertedString =0;
        try{
            convertedString = Integer.parseInt(str);
        } catch(IllegalArgumentException e) {
            System.out.println("Sorry, this string cannot be converted into an integer.");
        }
        return convertedString;
    }    
}
