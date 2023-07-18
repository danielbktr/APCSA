// Made by Daniel Boktor on April 18 2023
// Program sorts Movie objects using insertion sort
// according to different qualities they have.
public class MovieTesterV3{
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
        System.out.println("\nArray sorted by year, ascending: ");
        sortByYear(movieArray, 1);
        printNames(movieArray);
        System.out.println("\nArray sorted by year, descending: ");
        sortByYear(movieArray, 2);
        printNames(movieArray);
        System.out.println("\nArray sorted by title, ascending");
        sortByTitle(movieArray, 1);
        printNames(movieArray);
        System.out.println("\nArray sorted by title, descending");
        sortByTitle(movieArray, 2);
        printNames(movieArray);
        System.out.println("\nArray sorted by studio, ascending: ");
        sortByStudio(movieArray, 1);
        printNames(movieArray);
        System.out.println("\nArray sorted by studio, descending: ");
        sortByStudio(movieArray, 2);
        printNames(movieArray);


    }
    static void sortByYear(Movie movArray[], int flip) 
    { 
        if (flip==1){
        for (int i = 0; i < movArray.length-1; i++) 
        { 
            int minimumIndex = i; 
            for (int j = i+1; j < movArray.length; j++) 
                if (movArray[j].getYear() < movArray[minimumIndex].getYear()) 
                    minimumIndex = j; 
   
            Movie temp = movArray[minimumIndex]; 
            movArray[minimumIndex] = movArray[i]; 
            movArray[i] = temp; 
        } 
    } 
    else if (flip ==2){
        for (int i = 0; i < movArray.length-1; i++) 
        { 
            int minimumIndex = i; 
            for (int j = i+1; j < movArray.length; j++) 
                if (movArray[j].getYear() > movArray[minimumIndex].getYear()) 
                    minimumIndex = j; 
   
            Movie temp = movArray[minimumIndex]; 
            movArray[minimumIndex] = movArray[i]; 
            movArray[i] = temp; 
        } 
    }
}
 
static void sortByStudio(Movie movArray[], int flip) 
{ 
    if (flip==1){
    for (int i = 0; i < movArray.length-1; i++) 
    { 
        int minimumIndex = i; 
        for (int j = i+1; j < movArray.length; j++) 
            if (movArray[minimumIndex].getStudio().compareToIgnoreCase(movArray[j].getStudio())>0) 
                minimumIndex = j; 

        Movie temp = movArray[minimumIndex]; 
        movArray[minimumIndex] = movArray[i]; 
        movArray[i] = temp; 
    } 
} 
else if (flip ==2){
    for (int i = 0; i < movArray.length-1; i++) 
    { 
        int minimumIndex = i; 
        for (int j = i+1; j < movArray.length; j++) 
            if (movArray[minimumIndex].getStudio().compareToIgnoreCase(movArray[j].getStudio())<0) 
                minimumIndex = j; 

        Movie temp = movArray[minimumIndex]; 
        movArray[minimumIndex] = movArray[i]; 
        movArray[i] = temp; 
    } 
    }}

static void sortByTitle(Movie movArray[], int flip) 
{ 
    if (flip==1){
    for (int i = 0; i < movArray.length-1; i++) 
    { 
        int minimumIndex = i; 
        for (int j = i+1; j < movArray.length; j++) 
            if (movArray[minimumIndex].getTitle().compareToIgnoreCase(movArray[j].getTitle())>0) 
                minimumIndex = j; 

        Movie temp = movArray[minimumIndex]; 
        movArray[minimumIndex] = movArray[i]; 
        movArray[i] = temp; 
    } 
} 
else if (flip ==2){
    for (int i = 0; i < movArray.length-1; i++) 
    { 
        int minimumIndex = i; 
        for (int j = i+1; j < movArray.length; j++) 
            if (movArray[minimumIndex].getTitle().compareToIgnoreCase(movArray[j].getTitle())<0) 
                minimumIndex = j; 

        Movie temp = movArray[minimumIndex]; 
        movArray[minimumIndex] = movArray[i]; 
        movArray[i] = temp; 
    } 
    }}

    public static void printNames(Movie[] listlike){
        for(int i=0; i<listlike.length;i++){
            System.out.println(listlike[i].toString());}}
}