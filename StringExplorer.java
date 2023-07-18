/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 * @Daniel Boktor
 * @02/27/23
 */
public class StringExplorer
{


    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "   The landscape was pretty.   ";

        //  Add examples below for the following methods:
        //    trim()

        System.out.println("sample.trim() = "+ sample.trim());
        
        // length
        System.out.println("sample.length() = "+ sample.length());

        // indexOf
        System.out.println("sample.indexOf(\"M\") = "+ sample.indexOf("M"));
        System.out.println("sample.indexOf(\"M\", position + 1) = " + sample.indexOf("M", position + 1));

        // substring
        System.out.println("sample.substring(5) = " + sample.substring(5));        
        System.out.println("sample.substring(5,10) = " + sample.substring(5,10));

        // compareTo
        System.out.println("sample.compareTo(\"The quick brown fox jumped over the lazy dog.\" = " + sample.compareTo("The quick brown fox jumped over the lazy dog."));

        // toCharArray, toString
        System.out.println(" (sample.toCharArray()).toString() = " + (sample.toCharArray()).toString());
    }

}
