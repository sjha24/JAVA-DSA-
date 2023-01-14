public class aap {
    public static void main(String[] args) {
        student1 s1 = new student1();
        s1.setName("Saurav","saurav@24");
        s1.setRollNumber(2424,"saurav@24");
        s1.setGender('M',"Saurav@24");
        s1.setMarks(85,"Saurav@24");
        
        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getRollNum());
        System.out.println(s1.getMarks());
    }
}
