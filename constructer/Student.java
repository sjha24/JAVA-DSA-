// package constructer;
// package dynamicInsilatioinPropertie;

public class Student{
    private String name;
    private double marks;
    private int rollNum;
    private char Gender;
    //default explicit parameter
    public Student() {// constructer for bydefault data; && Special Function
        name = "Saurav";
        marks = 100;
        rollNum = 1;
        Gender = 'M';
    }

    //parametrised properties
    // public student(String newName, char NewGender,int newRollNum ,double newmarks){
    //     name = newName;
    //     Gender = NewGender;
    //     rollNum = newRollNum;
    //     marks = newmarks;
    // }
    // public student(String newName){
    //     name = newName;
    // }
    public Student(int NewMarks){
        marks = NewMarks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public int getRollNum() {
        return rollNum;
    }

    public char getGender() {
        return Gender;
    }
    // public seter

    public void setName(String newName) {
        name = newName;
    }

    public void setRollNumber(int newRollNum) {
        rollNum = newRollNum;
    }

    public void setMarks(double newMarks) {
        marks = newMarks;
    }

    public void setGender(char newGender) {
        Gender = newGender;
    }
}
