import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        student s[] = new student[n];
        for(int i = 0; i<s.length; i++){
            s[i] = new student();
            s[i].name = "Saurav";
            s[i].gender = 'M';
            s[i].DOB = "24 2 1998";
            s[i].roll_num = 4232;
            s[i].standard = "SDE-1";
            s[i].city = "Patna";
        }
        for(int i =  0 ; i<s.length; i++){
            System.out.println(s[i].name+" "+s[i].gender+" "+s[i].DOB+" "+s[i].roll_num+" "+s[i].standard+" "+s[i].city);
        }
    }
}