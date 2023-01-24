class student{
    String name;
    char gender;
    int rollNum;
    int marks;


    public void setRollNum(int newRollNum){
        rollNum = newRollNum;
    }
    public void study(){
        System.out.println("Student is reading");
    }
    public void play(String sport){
        System.out.println("Student is playing "+sport);
    }
    public void setMarks(int newMarks){
        marks = newMarks;
    }
    public boolean getResult(){
        if(marks>=33)return true;
        else return false;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Saurav";
        s1.gender = 'M';
        s1.study();
        System.out.println(s1.getResult());
        s1.play("Chess");
    }
}