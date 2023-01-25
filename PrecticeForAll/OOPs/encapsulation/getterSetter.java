class student{
    private String name;
    private char gender;
    private int rollNum;
    private int marks;

    public void setName(String NewName){
        name = NewName;
    }
    public void setGender(char newGender){
        gender = newGender;
    }
    public void setRollNum(int newRollNum){
        rollNum = newRollNum;
    }
    public void setMarks(String password,int newMarks){
        if(password.equals("1234")==true)
           marks = newMarks;
    }
    public String getName(){
        return name;
    }

    public char getGender(){
        return gender;
    }

    public int getRollNum(){
        return rollNum;
    }

    public int getMarks(){
        return marks;
    }
}
public class getterSetter {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Saurav Jha");
        s1.setGender('M');
        s1.setRollNum(82);
        s1.setMarks("1234",87);

        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getRollNum());
        System.out.println(s1.getMarks());
    }
    
}
