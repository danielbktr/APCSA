public class ElectionTesterV8{
    public static void printNames(Candidate[] arr){
        double total = 0.0;
        for (int i=0;i<arr.length;i++){
            total += arr[i].getVotes();
            }
        System.out.println("Raw Election Data:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString() + "");
            }
        System.out.println();
        System.out.printf("%-12s %-12s %-12s", "Candidate", "Votes", " % of Total");
        for (int i=0;i<arr.length;i++){
            System.out.println();
            System.out.printf("%-12s %-12d %-12.2f", arr[i].getName(), arr[i].getVotes(), ((arr[i].getVotes()/total))*100);
            }
        System.out.println();
        System.out.println("The total number of votes is: " + total);
        }

    public static void changeName(String newName, Candidate[] arr, String oldName){
        for (int i=0; i<arr.length;i++){
            if (arr[(i)].getName().equals(oldName)){
                arr[i].setName(newName);
                } 
            }
        }

    public static void changeVotes(int newVotes, Candidate[] arr, String name){
        for (int i=0; i<arr.length;i++){
            if (arr[i].getName().equals(name)){
                arr[(i)].setVotes(newVotes);
            } 
        }
    }
    public static void changeCandidate(int newVotes,String newName, Candidate[] arr, String oldName){
        for (int i=0; i<arr.length;i++){
            if (arr[(i)].getName().equals(oldName)){
                arr[(i)].setVotes(newVotes);
                arr[(i)].setName(newName);
                } 
            }
        }

    public static Candidate[] insertCandidate(int newVotes, String newName, Candidate[] arr, int location){
        Candidate temp = new Candidate(newName, newVotes);
        Candidate[] newArray = new Candidate[arr.length];
        for (int i=0; i<arr.length;i++){
            if (i==location){
                newArray[i] = temp;
            }
            else if (i>location){
                newArray[i] = arr[i-1];
            }
            else if (i < location){
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }

    public static Candidate[] insertCandidateBehindOther(int newVotes, String newName, Candidate[] arr, String oldName){
        int oldIndex = 0;
        for (int i =0; i<arr.length;i++){
            if (arr[i].getName() == oldName){
                oldIndex = i;
                }
            }
        int oldLength = arr.length;
        Candidate temp = new Candidate(newName, newVotes);
        Candidate[] newArray = new Candidate[oldLength];
        for (int i=0; i<oldLength;i++){
            if (i==(oldIndex-1)){
                newArray[i] = temp;
                }
            if (i>oldIndex-1){
                newArray[i] = arr[i-1];
            }
            if (i<oldIndex-1){
                newArray[i] = arr[i];
                }
            }
        return newArray;
        }
    
    public static Candidate[] deleteCandidateByIndex(int location, Candidate[] arr){
        Candidate[] newArray = new Candidate[arr.length-1];
        for (int i=0; i<arr.length;i++){
            if (i==location){
            }
            else if (i>location){
                newArray[i-1] = arr[i];
            }
            else if(i<location){
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }

    public static Candidate[] deleteCandidateByName(String name, Candidate[] arr){
        Candidate[] newArray = new Candidate[arr.length-1];
        int location = 99999;
        for(int i = 0; i<arr.length;i++){
            if (arr[i].getName().equals(name)){
                location = i;
            }
        }
        for (int i = 0; i<arr.length;i++){
            if (i>location){
                newArray[i-1] = arr[i];
            }
            if(i<location){
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }


        public static void main(String args[]){
            Candidate templist[];
            templist = new Candidate[5];

            
            Candidate john = new Candidate("John Adam", 1499);
            Candidate tom = new Candidate("Tom Smith", 9785);
            Candidate adam = new Candidate("Adam John", 2345);
            Candidate alex = new Candidate("Alex York", 1235);
            Candidate joseph = new Candidate("Jose Mars", 6534);
        
            templist[0] = john;
            templist[1] = tom;
            templist[2] = adam;
            templist[3] = alex;
            templist[4] = joseph;
            changeName("Timothy Adams", templist, "John Adam");
            changeVotes(1932, templist, "Timothy Adams");
            changeCandidate((1945), "Thomas Brady", templist, "Tom Smith");
            System.out.println("Pre-Candidate-Insertion");
            printNames(templist);
            templist = insertCandidate(1400, "Ethan ", templist, 1);
            templist = insertCandidateBehindOther(1039, "Jaslyn Kaur", templist, "Thomas Brady");
            System.out.println("Pre-Candidate-Deletion");
            printNames(templist);
            templist = deleteCandidateByIndex(0, templist);
            templist = deleteCandidateByName("Thomas Brady", templist);
            printNames(templist);
            }
        }