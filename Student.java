// Made by Daniel Boktor on 04/11/2023
// Student class for use with StudentTester.java
import java.util.ArrayList;

public class Student{
    private String name;
    private ArrayList<Integer> quizList = new ArrayList<Integer>();


    public Student(String n,int q1,int q2,int q3,int q4,int q5){
    name =n;

    quizList.add(q1);
    quizList.add(q2);
    quizList.add(q3);
    quizList.add(q4);
    quizList.add(q5);
    }
    
    public String getName(){
        return this.name;}
    public int getQuiz(int index){
        return this.quizList.get(index);}
    public void setQuiz(int index,Integer score){
        quizList.set(index,score);}
    public void setName(String n){
        name = n;}
    public String toString(){
        String studentInfo = String.format("%-15s %-4d %-4d %-4d %-4d %-4d",this.name,this.quizList.get(0),this.quizList.get(1),this.quizList.get(2),this.quizList.get(3),this.quizList.get(4));
        return studentInfo;
    }
    }