// package copyConstructer;
class Student{
    private String name;
    private double marks;
    private int rollNum;
    private char Gender;
    
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
    //copy constructor---->
    Student(Student other){
        rollNum = other.rollNum;
        marks = other.marks;
        name = other.name;
        Gender = other.Gender;
    }
    Student(){
        name = "Saurav";
        rollNum = 1;
        Gender = 'M';
        marks = 100;

    }
}
public class app {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNumber(5);
        s1.setName("Saurav");
        s1.setGender('M');
        s1.setMarks(95);

        Student s2 = new Student(s1);
        System.out.println(s2.getRollNum());
        System.out.println(s2.getName());
        System.out.println(s2.getGender());
        System.out.println(s2.getMarks());
    }
}
