class user{
    private String name;
    private char gender;
    private String dateOfBirth;
    private String language;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public void viewShowListing(){
        System.out.println("Unauthenticated user");
        System.out.println("View show listing");
    } 
}
class registeredUser extends user{
    String email;
    String phoneNo;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void viewFreeShow(){
        System.out.println("Authenticated user");
        System.out.println("Registered user can watch free show");
    }
}
class subscribedUser extends registeredUser{
    private String annualPack;
    private String selectedPlanValidity;
    private String dowonload;
    
    public String getAnnualPack() {
        return annualPack;
    }
    public void setAnnualPack(String annualPack) {
        this.annualPack = annualPack;
    }
    public String getSelectedPlanValidity(){
        return this.selectedPlanValidity;
    }
    public void setSelectedPlanValidity(String selectedPlanValidity){
        this.selectedPlanValidity = selectedPlanValidity;
    }
    public String getDowonload() {
        return dowonload;
    }
    public void setDowonload(String dowonload) {
        this.dowonload = dowonload;
    }
    public void viewPaidShow(){
        System.out.println("Suscribed user can watch paid show");
    }
}
public class hotstar{
    public static void main(String[] args) {
        user u1 = new user();
        u1.setName("Pritam jha");
        u1.setGender('M');
        u1.setDateOfBirth("23/04/2002");
        u1.setLanguage("English");
        System.out.println(u1.getName());
        System.out.println(u1.getGender());
        System.out.println(u1.getDateOfBirth());
        System.out.println(u1.getLanguage());
        u1.viewShowListing();
        registeredUser u2 = new registeredUser();
        u2.setName("Subham");
        u2.setGender('M');
        u2.setDateOfBirth("23/05/1998");
        u2.setLanguage("Englisgh");
        u2.setEmail("subhamtitr@gamil.com");
        u2.setPhoneNo("8405819908");
        System.out.println(u2.getName());
        System.out.println(u2.getGender());
        System.out.println(u2.getLanguage());
        System.out.println(u2.getDateOfBirth());
        System.out.println(u2.getPhoneNo());
        System.out.println(u2.getEmail());
        u2.viewShowListing();
        u2.viewFreeShow();
        
        subscribedUser u3 = new subscribedUser();
        u3.setName("Saurav Jha");
        u3.setGender('M');
        u3.setDateOfBirth("24/02/1998");
        u3.setEmail("saurav24021998@gmail.com");
        u3.setPhoneNo("9315307748");
        u3.setAnnualPack("350");
        u3.setSelectedPlanValidity("1 Year");
        u3.setDowonload("yes");
        u3.setLanguage("English");

        System.out.println(u3.getName());
        System.out.println(u3.getGender());
        System.out.println(u3.getDateOfBirth());
        System.out.println(u3.getEmail());
        System.out.println(u3.getPhoneNo());
        System.out.println(u3.getAnnualPack());
        System.out.println(u3.getSelectedPlanValidity());
        System.out.println(u3.getDowonload());
        System.out.println(u3.getLanguage());
        u3.viewShowListing();
        u3.viewFreeShow();
        u3.viewPaidShow();
    }
}