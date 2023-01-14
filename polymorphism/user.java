public class user {
    private String name;
    private char gender;

    public user() {
        // System.out.println("usre");
    }

    public user(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

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

    //overriden function
    public void advertisement() {
        System.out.println("Many Ads");
    }
}
