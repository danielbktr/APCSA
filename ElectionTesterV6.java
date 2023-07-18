import java.util.ArrayList;
public class ElectionTesterV6 {
    public static void printNames(ArrayList<Candidate> arr){
        double total = 0.0;
        for (int i=0;i<arr.size();i++){
            total += arr.get(i).getVotes();
            }
        System.out.println("Raw Election Data:");
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).toString() + "");
            }
        System.out.println();
        System.out.printf("%-12s %-12s %-12s", "Candidate", "Votes", " % of Total");
        for (int i=0;i<arr.size();i++){
            System.out.println();
            System.out.printf("%-12s %-12d %-12.2f", arr.get(i).getName(), arr.get(i).getVotes(), (arr.get(i).getVotes()/total));
            }
        System.out.println();
        System.out.println("The total number of votes is: " + total);
        }

    public static void changeName(String newName, ArrayList<Candidate> arr, String oldName){
        for (int i=0; i<arr.size();i++){
            if (arr.get(i).getName().equals(oldName)){
                arr.get(i).setName(newName);
                } 
            }
        }

    public static void changeVotes(int newVotes, ArrayList<Candidate> arr, String name){
        for (int i=0; i<arr.size();i++){
            if (arr.get(i).getName().equals(name)){
                arr.get(i).setVotes(newVotes);
            } 
        }
    }
    public static void changeCandidate(int newVotes,String newName, ArrayList<Candidate> arr, String oldName){
        for (int i=0; i<arr.size();i++){
            if (arr.get(i).getName().equals(oldName)){
                arr.get(i).setVotes(newVotes);
                arr.get(i).setName(newName);
                } 
            }
        }
    public static void insertCandidate(int location, String newName, int votes, ArrayList<Candidate> arr){
        Candidate temp = new Candidate(newName, votes);
        arr.add(location, temp);
    }  

    public static void insertCandidateBeforeOther(String newName, int votes, ArrayList<Candidate> arr, String goBehind){
        Candidate temp = new Candidate(newName, votes);
        int tempIndex = 0;
        for (int i=0;i<arr.size();i++){
            if (arr.get(i).getName().equals(goBehind)){
                tempIndex = i;
                break;
            }
            else{
                continue;
            }
        }
        arr.add(tempIndex, temp);
        }
    
    public static void deleteCandidateByIndex(int location, ArrayList<Candidate> arr){
        for (int i =0; i<arr.size();i++){
            if(i==location){
                arr.remove(i);
            }
        }
    }

    public static void deleteCandidateByName(String name, ArrayList<Candidate> arr){
        for (int i =0; i<arr.size();i++){
            if(arr.get(i).getName().equals(name)){
                arr.remove(i);
            }
        }
    }


    public static void main(String args[]){
        Candidate john = new Candidate("John Adam", 1499);
        Candidate tom = new Candidate("Tom Smith", 9785);
        Candidate adam = new Candidate("Adam John", 2345);
        Candidate alex = new Candidate("Alex York", 1235);
        Candidate joseph = new Candidate("Jose Mars", 6534);
    
        ArrayList<Candidate> templist = new ArrayList<Candidate>();
        templist.add(john);
        templist.add(tom);
        templist.add(adam);
        templist.add(alex);
        templist.add(joseph);
        changeName("Timothy Adams", templist, "John Adams");
        changeVotes(1932, templist, "John Adams");
        changeCandidate((1945), "Thomas Brady", templist, "Tom Smith");
        printNames(templist);
        System.out.println("Pre-Candidate-Insertion");
        insertCandidate(0, "Johnny Adams", 143456, templist);
        insertCandidateBeforeOther("Timmy Adams", 12349, templist, "Johnny Adams");
        printNames(templist);
        System.out.println("Pre-Candidate-Deletion");
        deleteCandidateByIndex(0, templist);
        deleteCandidateByName("Jose Mars", templist);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printNames(templist);
        }
    }
