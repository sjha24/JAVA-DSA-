public class user{
    private String name;
    private char gender;
    private String dateOfBirth;

    public user(){
        System.out.println("User Constructor");
    }
    public user(String name, char gender){
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return this.name;
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
    public void viewShowListing(){
        System.out.println("Unauthenticated User");
        System.out.println("View Show Listing");
    }
}

