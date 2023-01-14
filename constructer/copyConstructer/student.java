import java.util.ArrayList;

public class student{
    private String name;
    private double marks;
    private int rollNum;
    private char Gender;
    ArrayList<String>subject;


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
    //copy constructor::Shallow copy ---->
    // public student(student other){
    //     rollNum = other.rollNum;
    //     marks = other.marks;
    //     name = other.name;
    //     Gender = other.Gender;
    //     subject = other.subject;
    // }

    //deep copy constructer
    public student(student other){
        rollNum = other.rollNum;
        marks = other.marks;
        name = other.name;
        Gender = other.Gender;
        subject = new ArrayList<>();
        for(String sub : other.subject){
            subject.add(sub);
        }
    }
    student(){
        name = "Saurav";
        rollNum = 1;
        Gender = 'M';
        marks = 100;
        subject = new ArrayList<>();
    }
}