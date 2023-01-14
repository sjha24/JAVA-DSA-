import java.util.Scanner;

// package concept2;

public class main {
    public static void swap(student x, student y){
        //not swap
        student z = x;
        x = y;
        y = z;
    }
    public static void swap1(student x, student y){
        //not swap
        student z = new student();
        z.marks = x.marks;
        z.Gender = x.Gender;
        x = y;
        y = z;
    }
    public static void swap2(student x, student y){
       //swap but no correct
        student z = x;
        x.marks = y.marks;
        x.Gender = y.Gender;

        y.marks = z.marks;
        y.Gender = z.Gender;
    } 
    public static void swap4(student x, student y){
        //actual swap
        student z = new student();
        z.marks = x.marks;
        z.Gender = x.Gender;

        x.marks = y.marks;
        x.Gender = y.Gender;

        y.marks = z.marks;
        y.Gender = z.Gender;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        student s = new student();
        s.marks = 55;
        s.Gender = 'M';
        student s1 = new student();
        s1.marks = 65;
        s1.Gender = 'F';
        System.out.println(s.marks+" "+s.Gender);
        System.out.println(s1.marks+" "+s1.Gender);
        // swap(s, s1);
        // swap1(s, s1);
        // swap2(s, s1);
        swap4(s, s1);
        System.out.println(s.marks+" "+s.Gender);
        System.out.println(s1.marks+" "+s1.Gender);
    }
}
