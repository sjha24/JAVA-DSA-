// package constructer;

public class main {
    public static void main(String[] args) {
        student s1 = new student();//constructer is calling;
        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getRollNum());
        System.out.println(s1.getMarks());

        student s2 = new student("Saurav Jha", 'M', 1, 88);
        System.out.println(s2.getName());
        System.out.println(s2.getGender());
        System.out.println(s2.getRollNum());
        System.out.println(s2.getMarks());

        student s3 = new student("Saurav");
        System.out.println(s3.getName());
        student s4 = new student(5,124);
        System.out.println(s4.getRollNum());
        System.out.println(s4.getMarks());


    }
}
