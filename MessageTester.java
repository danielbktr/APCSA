public class MessageTester {
    public static void main(String args[]){
        Message newMSG = new Message("08 abc123xy 16 Computer Science");
        System.out.println(newMSG.isValid());
        System.out.println(newMSG.wordCount());
    }
}
