// package concept2;

public class student {
    String name;
    int marks;
    double rollNum;
    char Gender;
    public void study(){
        System.out.println("Student is studying");
    }
    public void play(String Sport){
        System.out.println("Student is Playing "+Sport);
    }
    public boolean getResult(){
        if(marks>=30){
            return true;
        }
        return false;
    }
    public void setRollNo(int NewRollNo){
        rollNum = NewRollNo;
    }
}
