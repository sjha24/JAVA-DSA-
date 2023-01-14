
//multi lavel Inheritance
public class registredUser extends user {
    private String email;
    private String phoneNum;

    public registredUser(){
        super();//parent's call-->(user);
        System.out.println("Register user Constructor");
    }
    public registredUser(String name, char gender,String email, String phoneNum){
        
        super(name, gender);//preorder call
        this.email = email;
        this.phoneNum = phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void viewFreeShowes(){
        System.out.println("Authenticated User");
        System.out.println("View free Show");
    }
}
