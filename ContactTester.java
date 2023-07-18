// This program was made by Daniel Boktor on April 20, 2023
// This program is a tester for the contact class that also includes several sorting and searching algorithms to search for different objects in an array.
public class ContactTester {
    public static void main(String args[]){
        Contact bob = new Contact("Bob M", "Father","092406", "4078361234", "bobm@gmail.com");
        Contact john = new Contact("John A", "Friend","061987", "0975837345", "johna@gmail.com");
        Contact adam = new Contact("Adam S", "Friend","123096", "2634895734", "adams@gmail.com");
        Contact samantha = new Contact("Samantha R", "Coworker","011196", "8622895384", "samanthar@gmail.com");
        Contact ryan = new Contact("Ryan W", "Friend","092406", "1025123488", "ryanw@gmail.com");
        Contact ethan = new Contact("Ethan R", "Best Friend","021786", "8098962153", "ethanr@gmail.com");
        Contact johnny = new Contact("Johnny D", "Spouse","110489", "2746037353", "johnnyd@gmail.com");
        Contact joseph = new Contact("Joseph B", "Associate","121502", "0967743650", "josephb@gmail.com");
        Contact matthew= new Contact("Matthew M", "Coworker","050603", "4078361234", "matthewm@gmail.com");
        Contact vincent = new Contact("Vincent A", "Boss","012591", "7394768552", "vincenta@gmail.com");

        Contact[] contacArr = new Contact[10];
        contacArr[0] = bob;
        contacArr[1] =john ;
        contacArr[2] = adam;
        contacArr[3] = samantha;
        contacArr[4] = ryan;
        contacArr[5] = ethan;
        contacArr[6] = johnny;
        contacArr[7] = joseph;
        contacArr[8] = matthew;
        contacArr[9] = vincent;
    
        System.out.println("Original Array: ");
        printArray(contacArr);
        System.out.println("\n\nArray sorted by names: ");
        sortByName(contacArr);
        printArray(contacArr);
        System.out.println("The name 'Ryan W' was found at index(es) " + findByName(contacArr, "Ryan W"));
        System.out.println("\n\nArray sorted by relationships: ");
        sortByRelation(contacArr);
        printArray(contacArr);
        System.out.println("The relationship 'Friend' was found at index(es) " + findByRelationship(contacArr, "Friend"));
        System.out.println("\nThe email 'vincenta@gmail.com' was found at index(es) " + findDuplicateEmails(contacArr, "vincenta@gmail.com"));
        System.out.println("\nThe phone number '0967743650' was found at index(es) " + findDuplicatePhones(contacArr, "0967743650"));
        System.out.println("\nThe birthday month '06' was found at index(es) " + findBirthdayMonth(contacArr, (12)));
        
    
    }   

    public static void sortByName(Contact[] arr){
        for (int i=0;i<arr.length;i++){
            while((i-1>-1) && (arr[i].getName().compareToIgnoreCase(arr[i-1].getName())<0)){
                Contact temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]= temp;
                i--;
            }
        }
    }

    public static void sortByRelation(Contact[] arr){
        for (int i=0;i<arr.length;i++){
            while((i-1>-1) && (arr[i].getRelation().compareToIgnoreCase(arr[i-1].getRelation())<0)){
                Contact temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]= temp;
                i--;
            }
        }
    }

    

    public static String findByName(Contact[] arr,String name){
        String indexList = "";
        int left= 0;
        int right = arr.length-1;
        Integer mid = 0;
        while (left<=right){  
            
            if (arr[mid].getName().equals(name)){
                indexList += (" "+ mid.toString());
                Integer above=mid+1;
                Integer below=mid-1;
                while(true){
                    if ((below>-1)&& (arr[below].getName().equals(arr[mid].getName()))){
                        indexList+=(" " + (below).toString());
                    }
                    else if ((above<arr.length) &&(arr[above].getName().equals(arr[mid].getName()))){
                        indexList+=(" " + (above).toString());
                    }
                    else{
                        break;
                    }
                    below--;
                    above++;
                }
                break;
                }
            else if (arr[mid].getName().compareTo(name)>0){
                right=mid-1;
                 }
            else if (arr[mid].getName().compareTo(name)<0){
                left=mid+1;
                }
            mid = ((left+right)/2);
            }
        if(indexList.equals("")){
            indexList = "Not Found";
        }
        return indexList;
    }

    public static String findBirthdayMonth(Contact[] arr, int month){
        String indexList = "";
        for (Integer i=0;i<arr.length;i++){
            if ((arr[i].getBirthday())/10000 == month){
                indexList += i.toString()+" ";
            }
        }
        if(indexList.equals("")){
            indexList = "Not Found";
        }
        return indexList;
    }

    public static String findDuplicatePhones(Contact[] arr, String num){
        String indexList = "";
        for (Integer i=0;i<arr.length;i++){
            if ((arr[i].getPhone().equals(num))){
                indexList += i.toString()+" ";
            }
        }
        if(indexList.equals("")){
            indexList = "Not Found";
        }
        return indexList;
    }

    public static String findDuplicateEmails(Contact[] arr, String email){
        String indexList = "";
        for (Integer i=0;i<arr.length;i++){
            if ((arr[i].getEmail().equals(email))){
                indexList += i.toString()+" ";
            }
        }
        if(indexList.equals("")){
            indexList = "Not Found";
        }
        return indexList;
    }

    public static String findByRelationship(Contact[] arr,String relationship){
        String indexList = "";
        int left= 0;
        int right = arr.length-1;
        Integer mid = 0;
        while (left<=right){  
            
            if (arr[mid].getRelation().equals(relationship)){
                indexList += (" "+ mid.toString());
                Integer above=mid+1;
                Integer below=mid-1;
                while(true){
                    if ((below>-1)&& (arr[below].getRelation().equals(arr[mid].getRelation()))){
                        indexList+=(" " + (below).toString());
                    }
                    else if ((above<arr.length) &&(arr[above].getRelation().equals(arr[mid].getRelation()))){
                        indexList+=(" " + (above).toString());
                    }
                    else{
                        break;
                    }
                    below--;
                    above++;
                }
                break;
                }
            else if (arr[mid].getRelation().compareTo(relationship)>0){
                right=mid-1;
                 }
            else if (arr[mid].getRelation().compareTo(relationship)<0){
                left=mid+1;
                }
            mid = ((left+right)/2);
            }
        if(indexList.equals("")){
            indexList = "Not Found";
        }
        return indexList;
    }

    public static void printArray(Contact[] arr){
        System.out.println(String.format("%-12s %-12s %-8s %-12s %-15s", "name", "relation", "birthday", "phone", "email"));
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }
    } 
}
