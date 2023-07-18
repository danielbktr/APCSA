// Made by Daniel Boktor on April 18, 2023
// Programs sorts through arrays of the Music object and searches for certain songs based on different criteria
public class MusicTesterv1v2{
    public static void main(String args[]){
        Music[] musicarr = new Music[10];
        musicarr[0] = new Music("Toxic", 2003, "Britney Spears");
        musicarr[1] = new Music("Umbrella", 2007, "Rihanna");
        musicarr[2] = new Music("Hey Ya!", 2003, "Outkast");
        musicarr[3] = new Music("Viva La Vida",2008,"Coldplay");
        musicarr[4] = new Music("Lose Yourself", 2002, "Eminem");
        musicarr[5] = new Music("Paper Planes", 2007, "M.I.A.");
        musicarr[6] = new Music("Feel Good Inc", 2005, "Gorillaz");
        musicarr[7] = new Music("Ms. Jackson", 2000, "Outkast");
        musicarr[8] = new Music("Hips Don't Lie", 2005, "Shakira");
        musicarr[9] = new Music("Fallin'", 2001, "Alicia Keys");

        printArr(musicarr);

        System.out.println("\nSequential search by song name:");
        System.out.println("'Toxic'is at position "+findBySongTitle(musicarr,"Toxic") + " in array");
        
        System.out.println("\nSequential search by song name with no result:");
        System.out.println("'Flash Delirium' is at position "+findBySongTitle(musicarr,"Flash Delirium") + " in array");
        


        System.out.println("\nSequential search by artist name: ");
        System.out.println("'Outkast' songs are at position "+findByArtistName(musicarr,"OutKast") + " in array");
        
        System.out.println("\nSequential search by artist name with no result: ");
        System.out.println("'Drake' songs are at position "+findByArtistName(musicarr,"Drake") + " in array");

        System.out.println("\nSequential search by year: ");
        System.out.println("Songs from 2003 are at position "+findByYear(musicarr, 2003) + " in array");
        
        System.out.println("\nSequential search by year with no result : ");
        System.out.println("Songs from 2020 are at position "+findByYear(musicarr, 2020) + " in array\n");
        
        
    }

    public static int findBySongTitle(Music[] arr, String title){
        for (int i =0; i<arr.length;i++){
            if (arr[i].getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }

    public static String findByYear(Music[] arr, int year){
        String indexList = "";
        for (Integer i =0; i<arr.length;i++){
            if (arr[i].getYear()==(year)){
                indexList += (" "+ i.toString());
            }
        }
        if( indexList.equals("")){
            indexList = "-1";
        }
        return indexList;
    }


    public static int findByArtistName(Music[] arr, String artistName){
        for (int i =0; i<arr.length;i++){
            if (arr[i].getArtist().equals(artistName)){
                return i;
            }
        }
        return -1;
    }


    public static void printArr(Music[] arr){
        for (int i =0; i< arr.length ;i++){
            System.out.println(arr[i].toString());
        }
    }
}