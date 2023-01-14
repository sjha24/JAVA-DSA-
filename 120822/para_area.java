import java.util.Scanner;
public class para_area{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double py = 3.14;
        double r = scn.nextDouble();
        area(py, r); 
    }
    public static void area(double py,double r){
        double area = 2 * py *r*r;
        double parameter = 2 * py * r;
        System.out.println(area);
        System.out.println(parameter);
    }
}