// Made by Daniel Boktor on April 19 2022
// Program sorts songs based on different metrics and then finds them using binary search on any one of their qualiites. Finds all songs validate the condition, not just the first located.
public class MusicTesterV2{
    public static void main(String args[]){
        Music[] musicarr = new Music[10];
        musicarr[0] = new Music("Toxic", 2003, "Britney Spears");
        musicarr[1] = new Music("Umbrella", 2007, "Rihanna");
        musicarr[2] = new Music("Hey Ya!", 2003, "Outkast");
        musicarr[3] = new Music("Viva La Vida",2008,"Coldplay");
        musicarr[4] = new Music("Circus", 2008, "Britney Spears");
        musicarr[5] = new Music("Paper Planes", 2007, "M.I.A.");
        musicarr[6] = new Music("Feel Good Inc", 2005, "Gorillaz");
        musicarr[7] = new Music("Ms. Jackson", 2000, "Outkast");
        musicarr[8] = new Music("Hips Don't Lie", 2005, "Shakira");
        musicarr[9] = new Music("Fallin'", 2001, "Alicia Keys");


        printArr(musicarr);
        System.out.println("\nArray sorted by artist name:");
        sortByArtist(musicarr);
        printArr(musicarr);System.out.println("\n\nSongs by 'Outkast'  are at position "+findByName(musicarr,"OutKast") + " in array");
        System.out.println("\nArray sorted by song name:");
        sortByTitle(musicarr);
        printArr(musicarr);System.out.println("\n\nSongs named: 'Feel Good Inc' are at position "+findByTitle(musicarr,"Toxic") + " in array");
        System.out.println("\nArray sorted by year:");
        sortByYear(musicarr);
        printArr(musicarr);System.out.println("Songs from '2003' are at position "+findByYear(musicarr, 2003) + " in array");
        
    }

    public static void sortByTitle(Music[] arr){
        for (int i=0;i<arr.length;i++){
            while((i-1>-1) && (arr[i].getTitle().compareToIgnoreCase(arr[i-1].getTitle())<0)){
                Music temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]= temp;
                i--;
            }
        }
    }

    public static void sortByArtist(Music[] arr){
        for (int i=0;i<arr.length;i++){
            while((i-1>-1) && (arr[i].getArtist().compareToIgnoreCase(arr[i-1].getArtist())<0)){
                Music temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]= temp;
                i--;
            }
        }
    }

    public static void sortByYear(Music[] arr){
        for (int i=0;i<arr.length;i++){
            while((i-1>-1) && (arr[i].getYear()<(arr[i-1].getYear()))){
                Music temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]= temp;
                i--;
            }
        }
    }
    
    
    public static String findByYear(Music[] arr, int year){
        String indexList = "";
        int left= 0;
        int right = arr.length-1;
        Integer mid = 0;
        while (left<=right){  
            
            if (arr[mid].getYear()==(year)){
                indexList += (" "+ mid.toString());
                Integer above=mid+1;
                Integer below=mid-1;
                while(true){
                    if (arr[below].getYear()==arr[mid].getYear()){
                        indexList+=(" " + (below).toString());
                    }
                    else if (arr[above].getYear()==arr[mid].getYear()){
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
            else if (arr[mid].getYear()>(year)){
                right = mid-1;
                 }
            else if (arr[mid].getYear()<(year)){
                left =mid+1;
                }mid = ((left+right)/2);
            }
        if(indexList.equals("")){
            indexList = "Songs Not Found";
        }
        return indexList;
    }
        

    public static String findByName(Music[] arr,String name){
            String indexList = "";
            int left= 0;
            int right = arr.length-1;
            Integer mid = 0;
            while (left<=right){  
                
                if (arr[mid].getArtist().equals(name)){
                    indexList += (" "+ mid.toString());
                    Integer above=mid+1;
                    Integer below=mid-1;
                    while(true){
                        if ((below>-1)&& (arr[below].getArtist().equals(arr[mid].getArtist()))){
                            indexList+=(" " + (below).toString());
                        }
                        else if ((above<arr.length) &&(arr[above].getArtist().equals(arr[mid].getArtist()))){
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
                else if (arr[mid].getArtist().compareTo(name)>0){
                    right=mid-1;
                     }
                else if (arr[mid].getArtist().compareTo(name)<0){
                    left=mid+1;
                    }
                mid = ((left+right)/2);
                }
            if(indexList.equals("")){
                indexList = "Songs Not Found";
            }
            return indexList;
        }
        
        public static String findByTitle(Music[] arr,String title){
            String indexList = "";
            int left= 0;
            int right = arr.length-1;
            Integer mid = 0;
            while (left<=right){  
                
                if (arr[mid].getTitle().equals(title)){
                    indexList += (" "+ mid.toString());
                    Integer above=mid+1;
                    Integer below=mid-1;
                    while(true){
                        if ((below>-1)&& (arr[below].getTitle().equals(arr[mid].getTitle()))){
                            indexList+=(" " + (below).toString());
                        }
                        else if ((above<arr.length) &&(arr[above].getTitle().equals(arr[mid].getTitle()))){
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
                else if (arr[mid].getTitle().compareTo(title)>0){
                    right=mid-1;
                     }
                else if (arr[mid].getTitle().compareTo(title)<0){
                    left=mid+1;
                    }
                mid = ((left+right)/2);
                }
            if(indexList.equals("")){
                indexList = "Songs Not Found";
            }
            return indexList;
        }

    public static void printArr(Music[] arr){
        for (int i =0; i< arr.length ;i++){
            System.out.println("       " + arr[i].toString());
        }
    }
}