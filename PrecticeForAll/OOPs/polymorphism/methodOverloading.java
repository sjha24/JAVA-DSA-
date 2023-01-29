class user{
    private String name;
    public void setName(String firstName, String middleName, String lastName){
        name = firstName+" "+middleName + " "+lastName;
    }
    public void setName(String firstName, String lastName){
        name = firstName+ " "+lastName;
    }
    public void setName(String firstName){
        name = firstName;
    }
    public void setName(char firstLatter, char secondLatter, String lastName){
        name = firstLatter+" "+secondLatter + " "+lastName;
    }
    public void setName(char firsLatter, String middleName, String lastName){
        name = firsLatter+" "+middleName + " "+lastName;
    }
    public String getName(){
        return name;
    }
}
public class methodOverloading {
    //real world examle of compile time polymorphism
    public static void main(String[] args) {
        user u1 = new user();
        u1.setName("Saurav");
        System.out.println(u1.getName());
        u1.setName("Saurav", "Jha");
        System.out.println(u1.getName());
        u1.setName("IAS", "Saurav", "Kumar");
        System.out.println(u1.getName());
        u1.setName('S', "K", "Jha");
        System.out.println(u1.getName());
        u1.setName('S', 'K', "Jha");
        System.out.println(u1.getName());
    }

}
