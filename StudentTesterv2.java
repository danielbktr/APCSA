// Made by Daniel Boktor on 04/11/2023
// Program adds methods for arraylists of students, and tests the methods of the original Student class.

import java.util.ArrayList;
public class StudentTesterv2 {
    public static void main(String args[]){
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student s0 = new Student("Ronald Reagan", 90, 85, 87, 96, 97);
        Student s1 = new Student("George Bush", 76, 84, 86, 57, 34);
        Student s2 = new Student("Bill Clinton", 86, 82, 87, 97, 95);
        Student s3 = new Student("Barack Obama", 90, 96, 87, 86, 64);
        Student s4 = new Student("Joe Biden", 56, 97, 67, 65, 97);
        studentList.add(s0);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);


        System.out.println("\n\t\tStarting Gradebook\n");
        printNames(studentList);
        replaceName(studentList, 0, "Donald Trump");
        replaceQuiz(studentList, 1, 0, 91);
        replaceStudent(studentList, "Bill Clinton", "Harry Truman", 82, 12, 54, 84, 65);
        deleteStudent(studentList, "Joe Biden");
        StudentInsertBeforeAnotherStudent(studentList, "John Adams", 1, 98, 100, 64, 89, 99);
        System.out.println("\n\n\n\t\tFinal Gradebook, after replacement of Ronald Reagan with Donald Trump, George Bush's first quiz going from an 76 to a 91, Bill Clinton being replaced by Harry Truman, Joe Biden being deleted from the gradebook, and John Adams being inserted before George Bush. \n");
        printNames(studentList);
    }
    
    
    public static void printNames(ArrayList<Student> list){
        String header = String.format("%-15s %-4s %-4s %-4s %-4s %-4s", "Student Name","Q1","Q2","Q3","Q4","Q5");
        System.out.println(header);
        for(int i=0;i<38;i++){
            System.out.print("=");}
        System.out.println("\n");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());}}
    
    
    public static void replaceName(ArrayList<Student> list,int index,String newName){
        list.get(index).setName(newName);;
    }   



    public static void replaceQuiz(ArrayList<Student> list, int studentIndex,int quizIndex, int newQuiz){
        list.get(studentIndex).setQuiz(quizIndex, newQuiz);
    }
    
    public static void StudentInsertBeforeAnotherStudent(ArrayList<Student> list, String newStudentName, int targetIndex,int q1, int q2, int q3, int q4, int q5){
        Student tempStudent = new Student(newStudentName,q1,q2,q3,q4,q5);
        list.add(targetIndex,tempStudent);
    }
    
    public static void replaceStudent(ArrayList<Student> list, String oldName, String n,int q1,int q2,int q3,int q4,int q5){
        Student newStudent = new Student(n,q1,q2,q3,q4,q5);
        int index = 100000;
        for (int i =0; i<list.size();i++){
            if (list.get(i).getName().equals(oldName)){
                index = i;}}
        if (index == 100000){
            System.out.println("Name not found");}
        list.set(index, newStudent);
    }
    
    
    public static void deleteStudent(ArrayList<Student> list, String oldName){
        int index = 100000;
        for (int i =0; i<list.size();i++){
            if (list.get(i).getName().equals(oldName)){
                index = i;}}
        if (index == 100000){
            System.out.println("Name not found for deletion");}
        list.remove(index);
    }


}
