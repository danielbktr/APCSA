// @ author Daniel Boktor
// @ version 09/13/22
// This program calculates total points and average grade everytime a new grade is added to the total
public class GradesV3
{
    public static void main(String[  ] args){
        while(true){
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        testGrade = 95;
        totalPoints += testGrade;
        numTests ++;
        average = ((double)totalPoints/numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

         testGrade = 73;
         totalPoints += testGrade;
         numTests ++;
         average = ((double)totalPoints/numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

         testGrade = 91;
         totalPoints += testGrade;
         numTests ++;
         System.out.println(numTests);
         average = ((double)totalPoints / numTests);
        System.out.print("Test #" + numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

         testGrade = 82;
         totalPoints += testGrade;
         numTests ++;
         average = ((double)totalPoints / numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

        testGrade = 94;
         totalPoints += testGrade;
         numTests ++;
         average = ((double)totalPoints / numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

        testGrade = 81;
         totalPoints += testGrade;
         numTests ++;
         average = ((double)totalPoints / numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

        testGrade = 97;
         totalPoints += testGrade;
         numTests ++;
         average = ((double)totalPoints / numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

        testGrade = 100;
         totalPoints += testGrade;
         numTests ++;
         average = ((double)totalPoints / numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

        testGrade = 90;
         totalPoints += testGrade;
         numTests ++;
         average = ((double)totalPoints / numTests);
        System.out.print("Test #"+ numTests +"\t");
        System.out.print("Test Grade: "+ testGrade +"\t");
        System.out.print("Total Points: "+ totalPoints +"\t");
        System.out.print("Average score: "+ average +"    \n");

}    }
}

