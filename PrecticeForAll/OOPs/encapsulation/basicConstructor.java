class employ {
    private String name;
    private char gender;
    private String employID;
    private String department;
    private int attendnece;

    // employ(){}<--imlicit constructor provided by compiler
    // if any type of explicit constructor use by developer than compiler take back
    // implicit constructor

    // <-----------------------non peramatrised constructor------------>
    employ() {
        name = "NA";
        gender = 'N';
        employID = "NA";
        department = "NA";
    }

    // <------------------perametrised constructor-------------------------->

    employ(String newName, char newGender, String newEmployID, String NewDepartment) {
        name = newName;
        gender = newGender;
        employID = newEmployID;
        department = NewDepartment;
    }
    //<------------------------constructor overloading---------------------------->
    employ(String newName, String newDepartment){
        name = newName;
        department = newDepartment;
    }
    employ(String newDepartment, char newgender){
        department = newDepartment;
        gender = newgender;
    }
    employ(String newName, int newAttendnece){
        name = newName;
        attendnece = newAttendnece;
    }
    employ(short newAttendnece){
        attendnece = newAttendnece;
    }
    
    public String getName(){
        return name;
    }
    public String getEmployID(){
        return employID;
    }
    public char getGender(){
        return gender;
    }
    public String getDepartment(){
        return department;
    }
    public int getAttendnece(){
        return attendnece;
    }
}

public class basicConstructor {
    public static void main(String[] args) {
        employ e1 = new employ();        
        System.out.println(e1.getName());
        System.out.println(e1.getGender());
        System.out.println(e1.getEmployID());
        System.out.println(e1.getDepartment());
        employ e2 = new employ("Saurav Jha",'M',"S12122","SDE");
        System.out.println(e2.getName());
        System.out.println(e2.getGender());
        System.out.println(e2.getEmployID());
        System.out.println(e2.getDepartment());
        employ e3 = new employ("Saurav Jha", 24);
        System.out.println(e3.getName());
        System.out.println(e3.getAttendnece());

        employ e4 = new employ((short)24);//explicit type casting
        char ch = 'a';
        employ e5 = new employ((short)ch);
    }
}
