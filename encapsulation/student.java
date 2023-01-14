// package dynamicInsilatioinPropertie;

public class student {
    private String name;
    private double marks;
    private int rollNum;
    private char Gender;
    String subject[];
    public void setDefaultProperties(int n){
        name = "Saurav";
        marks = 100;
        rollNum = 1;
        Gender = 'M';
        subject = new String[n];
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

    public void setName(String newName, String password) {
        if(password.equals("saurav@24")==true){
            name = newName;
        }
    }

    public void setRollNumber(int newRollNum ,String password) {
        if(password.equals("saurav@24")==true){
            rollNum = newRollNum;
        }
    }

    public void setMarks(double newMarks,String password) {
        if(password.equals("Saurav@24")==true){
            marks = newMarks;
        }
    }

    public void setGender(char newGender, String password) {
        if(password.equals("Saurav@24")==true){
            Gender = newGender;
        }
    }
}
