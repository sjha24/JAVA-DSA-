public class regUser extends user{
    private String email;
    private String phoneNum;

    public regUser() {
    };

    public regUser(String name, char gender, String email, String phonrNum) {
        super(name, gender);
        this.email = email;
        this.phoneNum = phonrNum;
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

    @Override//mn ho to use kro na to na v kro
    //but isse use krne se if overrideing nhi ho rha h to ye denote kr deti h
    //overrided function
    public void advertisement() {
        System.out.println("Less ads");
    }
}
