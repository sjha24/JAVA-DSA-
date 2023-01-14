import java.util.Scanner;

// package this;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        char Gender = scn.next().charAt(0);
        int rollNum = scn.nextInt();
        double marks = scn.nextDouble();
        student s1 = new student(name,Gender,rollNum,marks);
        // System.out.println(s1.getName());
        // System.out.println(s1.getGender());
        // System.out.println(s1.getRollNum());
        // System.out.println(s1.getMarks());
        s1.printResult();
    }
}