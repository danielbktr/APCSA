// Made by Daniel Boktor on April 18 2023
// Program sorts Movie objects using insertion sort
// according to different qualities they have.
public class MovieTester{
    public static void main(String args[]){
        Movie m0 = new Movie("A Bug's Life", 1998,"Pixar");
        Movie m1 = new Movie("Toy Story", 1995,"Pixar");
        Movie m2 = new Movie("Brave",2012,"Pixar");
        Movie m3 = new Movie("Inside Out", 2015,"Pixar");
        Movie m4 = new Movie("Up", 2009,"Pixar");
        Movie m5 = new Movie("Ratatouille",2007,"Pixar");
        Movie m6 = new Movie("Cars", 2006,"Pixar");
        Movie m7 = new Movie("The Incredibles", 2004,"Pixar");
        Movie m8 = new Movie("Finding Nemo", 2003,"Pixar");
        Movie m9 = new Movie("Monsters, Inc", 2001,"Pixar");

        Movie[] movieArray = new Movie[10];
        movieArray[0] = m0;
        movieArray[1] = m1;
        movieArray[2] = m2;
        movieArray[3] = m3;
        movieArray[4] = m4;
        movieArray[5] = m5;
        movieArray[6] = m6;
        movieArray[7] = m7;
        movieArray[8] = m8;
        movieArray[9] = m9;

        System.out.println("Default Array: ");
        printNames(movieArray);
        System.out.println("");
        System.out.println("Array sorted by year, ascending: ");
        sortByYear(movieArray,1);
        printNames(movieArray);
        System.out.println("");
        System.out.println("Array sorted by year, descending: ");
        sortByYear(movieArray,2);
        printNames(movieArray);
        System.out.println("");
        System.out.println("Array sorted by title, ascending");
        sortByTitle(movieArray, 1);
        printNames(movieArray);
        System.out.println("");
        System.out.println("Array sorted by title, descending");
        sortByTitle(movieArray, 2);
        printNames(movieArray);
        System.out.println("");
        System.out.println("Array sorted by studio, ascending: ");
        sortByStudio(movieArray, 1);
        printNames(movieArray);
        System.out.println("");
        System.out.println("Array sorted by studio, descending: ");
        sortByStudio(movieArray, 2);
        printNames(movieArray);


    }
    public static void printNames(Movie[] listlike){
        for(int i=0; i<listlike.length;i++){
            System.out.println(listlike[i].toString());}}

    public static void sortByTitle(Movie[] arr, int flip){
        for (int i=0;i<arr.length;i++){
            if(flip == 1){
                while((i-1>-1) && (arr[i].getTitle().compareToIgnoreCase(arr[i-1].getTitle())<0)){
                    Movie temp = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]= temp;
                    i--;
                }
            }
            if (flip ==2){
                while((i-1>-1) && (arr[i].getTitle().compareToIgnoreCase(arr[i-1].getTitle())>0)){
                    Movie temp = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]= temp;
                    i--;
                }
            }
        }
    }


        public static void sortByStudio(Movie[] arr, int flip){
            for (int i=0;i<arr.length;i++){
                if(flip == 1){
                    while((i-1>-1) && (arr[i].getStudio().compareToIgnoreCase(arr[i-1].getStudio())<0)){
                        Movie temp = arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]= temp;
                        i--;
                    }
                }
                if (flip ==2){
                    while((i-1>-1) && (arr[i].getStudio().compareToIgnoreCase(arr[i-1].getStudio())>0)){
                        Movie temp = arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]= temp;
                        i--;
                    }
                }
            }
        }
        public static void sortByYear(Movie[] arr, int flip){
            for (int i=0;i<arr.length;i++){
                if(flip == 1){
                    while((i-1>-1) && (arr[i].getYear()<(arr[i-1].getYear()))){
                        Movie temp = arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]= temp;
                        i--;
                    }
                }
                if (flip ==2){
                    while((i-1>-1) && (arr[i].getYear()>(arr[i-1].getYear()))){
                        Movie temp = arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]= temp;
                        i--;
                    }
                }
            }
    }}