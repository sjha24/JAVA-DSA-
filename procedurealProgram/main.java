import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        student s1 = new student();
        //set the properties--
        s1.Name = "Saurav Jha";
        s1.Gender = 'M';
        s1.roll_Num = 2924;
        s1.marks = 395.0;
        //get the properties of studemt

        // System.out.println(s1.roll_Num);
        // System.out.println(s1.Name);
        // System.out.println(s1.Gender);
        // System.out.println(s1.marks);
        
        student arr[] = new student[4];
        arr[0] = s1;
        arr[1] = new student();
        arr[1].Name = "Sohan";
        arr[1].Gender = 'M';
        arr[1].roll_Num = 3218;
        arr[1].marks = 55.0;

        arr[2] = new student();
        arr[2].Name = "Madhu";
        arr[2].Gender = 'F';
        arr[2].roll_Num = 3224;
        arr[2].marks = 75.0;

        arr[3] = new student();
        arr[3].Name = "Pritam";
        arr[3].Gender = 'M';
        arr[3].roll_Num = 3222;
        arr[3].marks = 80.0;
        System.out.println(arr[0].roll_Num);
        System.out.println(arr[0].Gender);
        System.out.println(arr[0].marks);
        System.out.println(arr[0].Name);

        System.out.println(arr[1].roll_Num);
        System.out.println(arr[1].Gender);
        System.out.println(arr[1].marks);
        System.out.println(arr[1].Name);

        System.out.println(arr[2].roll_Num);
        System.out.println(arr[2].Gender);
        System.out.println(arr[2].marks);
        System.out.println(arr[2].Name);

        System.out.println(arr[3].roll_Num);
        System.out.println(arr[3].Gender);
        System.out.println(arr[3].marks);
        System.out.println(arr[3].Name);
    }

}