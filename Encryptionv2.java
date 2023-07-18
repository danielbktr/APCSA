import java.util.ArrayList;

// Made by Daniel Boktor on 6/20/23 to encrypt using a ceasar cipher
public class Encryptionv2 {
    private int shiftInteger;
    private String uncodedMessage;
    private static final String[] alphabetArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; 
    public Encryptionv2(int si,String message){
        uncodedMessage=message;
        shiftInteger=si;
    }


    public static ArrayList<String> defineShiftedAlphabet(int shiftInteger){
        ArrayList<String> shiftedAlphabet = new ArrayList<String>();
        for (int i=0;i<alphabetArray.length;i++){
            if ((i+shiftInteger)<25){
                shiftedAlphabet.add(String.valueOf(alphabetArray[(i+shiftInteger)]));
            }
            else{
                shiftedAlphabet.add(String.valueOf(alphabetArray[(i+shiftInteger-25)]));
            }
        }
        return shiftedAlphabet;
    }

    public static String createCodedMessage(ArrayList<String> shiftedAlphabet, int shiftInteger, String msg){
        String[] uncodedArray = msg.split("");
        ArrayList<String> codedMessage= new ArrayList<String>();
        ArrayList<String> uncodedArrayList = new ArrayList<String>();
        for (String temp:uncodedArray){
            uncodedArrayList.add(temp);
        }
        for(int i=0;i<uncodedArrayList.size();i++){
            int tempIndex = indexOfWithinArray(alphabetArray, uncodedArrayList.get(i));
            codedMessage.add(shiftedAlphabet.get(tempIndex)); 
        }
        return String.join("",codedMessage);
    }

    public static int indexOfWithinArray(String[] arr, String msg){
        int indexxxxx=-1111;
        for(int i=0;i<arr.length;i++){
            if(msg.equals(String.valueOf(arr[i]))){
                indexxxxx=i;
                return indexxxxx;
            }
        }
        return indexxxxx;
    }
}
