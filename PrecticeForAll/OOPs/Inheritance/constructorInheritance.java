class user{
    private String name;
    private String gender;
    public user(){};
    public user(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void userFun(){
        System.out.println("you cant show any type of video untill register");
    }
}
class registerUser extends user{
    private String emailID;
    private String mobileNo;
    public registerUser(){};
    public registerUser(String name, String gender, String emailID, String mobileNo) {
        super(name, gender);
        this.emailID = emailID;
        this.mobileNo = mobileNo;
    }
    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public void registerUserFun(){
        System.out.println("You can only watch free show");
    }
}
class subscribedUser extends registerUser{
    private String plan;
    private String planValidity;
    public subscribedUser(String plan, String planValidity) {
        this.plan = plan;
        this.planValidity = planValidity;
    }
    public subscribedUser(String name, String gender, String emailID, String mobileNo, String plan,
            String planValidity) {
        super(name, gender, emailID, mobileNo);
        this.plan = plan;
        this.planValidity = planValidity;
    }
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public String getPlanValidity() {
        return planValidity;
    }
    public void setPlanValidity(String planValidity) {
        this.planValidity = planValidity;
    }
    public void subscribedUserFun(){
        System.out.println("You can watch paid show and free show");
    }
}
public class constructorInheritance {
    public static void main(String[] args) {
        subscribedUser u1 = new subscribedUser("Saurav", "M", "saurav24021998@gmail.com", "9315307748", "selected", "1 year");
        System.out.println(u1.getName());
        System.out.println(u1.getGender());
        System.out.println(u1.getEmailID());
        System.out.println(u1.getMobileNo());
        System.out.println(u1.getPlan());
        System.out.println(u1.getPlanValidity());
        u1.userFun();
        u1.registerUserFun();
        u1.subscribedUserFun();
    }
}
