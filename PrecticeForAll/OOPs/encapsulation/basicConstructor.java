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
   

    public void setName(String Name) {
        name = Name;
    }

    public void setGender(char Gender) {
        gender = Gender;
    }

    public void setEmployID(String EmployID) {
        employID = EmployID;
    }

    public void setDepartment(String Department) {
        department = Department;
    }

    public void setAttendnece(int Attendnece) {
        attendnece = Attendnece;
    }
    //<------------------------copy constructor --------------------->
    employ(employ other){
        name = other.name;
        gender = other.gender;
        employID = other.employID;
        department = other.department;
        attendnece = other.attendnece;
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
        // employ e5 = new employ((short)ch);
        //<----------------------calling copyConstructor---------------------------->
        employ e5 = new employ();
        e5.setName("Saurav");
        e5.setGender('M');
        e5.setDepartment("SDE");
        e5.setEmployID("S1312");
        e5.setAttendnece(25);
        employ e6 = new employ(e5);
        System.out.println(e6.getName());
        System.out.println(e6.getGender());
        System.out.println(e6.getDepartment());
        System.out.println(e6.getEmployID());
        System.out.println(e6.getAttendnece());
    }
}
