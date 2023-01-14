package encapsulation;
import java.util.Scanner;

// package dynamicInsilatioinPropertie;

public class main {
    public static void main(String[] args){
        student s1 = new student();
        s1.setDefaultProperties(4);

        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getRollNum());
        System.out.println(s1.getMarks());

        s1.subject[0] = "C++";
        s1.subject[1] = "JAVA";
        s1.subject[2] = "DSA";
        s1.subject[3] = "HTML";
        for(String s : s1.subject){
            System.out.print(s+" ");
        }
    }
}
