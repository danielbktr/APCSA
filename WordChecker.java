public class WordChecker{
    private String[] wordArray;
    private int numOfWords;
    private String goalWord;

    public WordChecker(String[] words, int numWords, String targetWord){
        wordArray = words;
        numOfWords = numWords;
        goalWord = targetWord;
    }

    public boolean isWithin(){
        boolean boolIsWithin = false;
        for (int i=0; i<((wordArray).length);i++){
            if (wordArray[i].equals(goalWord)){
                boolIsWithin = true;
                break;
            }
            else{
                continue;}
        }
        return boolIsWithin;
    
    
    }
    public boolean sameNumber(){
        boolean sameNum = false;
        String[] splitTargetWord = goalWord.split("/");
        int targetLength = (splitTargetWord.length);
        if (targetLength == numOfWords){
            sameNum = true;
        }
        return sameNum;
    }        
}