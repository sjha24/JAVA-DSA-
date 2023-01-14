import java.util.Scanner;
public class f{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double radius = scn.nextDouble();
        double area = findArea(radius);
        System.out.println(area+" <--area");
        double perimeter = findPerimeter(radius);
        System.out.println(perimeter+" <--perimeter");
    }
    public static double findArea(double radius){
        double area = 3.14*(radius*radius);
        return area;
    }
    public static double findPerimeter(double radius){
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
    
}