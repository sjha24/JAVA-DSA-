// import java.util.Scanner;

// import encapsulation.main;

public class overLoad {
    public static void main(String[] args) {
        char ch = 'a';
        student s1 = new student(ch);
        System.out.println(s1.getMarks()); 

        student s2 = new student(5);
        System.out.println(s2.getMarks());

        long m = 917327382;
        student s3 = new student((double)m);
        System.out.println(s3.getMarks());
    }
 }
