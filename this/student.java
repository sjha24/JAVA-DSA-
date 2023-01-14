// package this;

public class student {
    private String name;
    private char Gender;
    private int rollNum;
    private double marks;
    //parametrised properties
    public student(String name, char Gender,int rollNum ,double marks){
       //parameter = parmeter;
        // name = name;
        // Gender = Gender;
        // rollNum = rollNum;
        // marks = marks;

        //property = parameter
        this.name = name;
        this.Gender = Gender;
        this.rollNum = rollNum;
        this.marks = marks;
    }
    public student(){

    }

    public String getName() {
        return this.name;
    }

    public double getMarks() {
        return this.marks;
    }

    public int getRollNum() {
        return rollNum;
    }

    public char getGender() {
        return Gender;
    }
    // public seter

    public void setName(String newName) {
        this.name = newName;
    }

    public void setRollNumber(int newRollNum) {
        rollNum = newRollNum;
    }

    public void setMarks(double newMarks) {
        this.marks = newMarks;
    }

    public void setGender(char newGender) {
        Gender = newGender;
    }
    
    public void printResult(){
        double marks = this.getMarks();
        if(marks<33){
            System.out.println("Fail");
        }else{
            System.out.println("Pass");
        }
    }
}
