public class Message{

    private int idLength;
    private String deviceID;
    private int msgLength;
    private String textMsg;

    public Message(String msg){
    //implementation not shown
    }

    public boolean isValid(){
        boolean valid = false;
        boolean validID = false;
        boolean validMSG = false;
        if (idLength == deviceID.length()){
            validID = true;
        }
        if (msgLength == textMsg.length()){
            validMSG = true;
        }
        if ((validMSG)& (validID)){
            valid = true;
        }
        else{
            valid = false;
        }
        return valid;
    }

    public int wordCount(){
        int countWords = 0;
        String[] wordArr = textMsg.split(" ");
        countWords = (wordArr.length); 
        return countWords;
    }
}