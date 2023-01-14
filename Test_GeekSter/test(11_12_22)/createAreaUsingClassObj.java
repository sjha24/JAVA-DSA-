import java.util.Scanner;

class Area{
    int rectangle;
    int breadth;
    Area(int rectangle, int breadth){
        this.rectangle = rectangle;
        this.breadth = breadth;
    }
}
public class createAreaUsingClassObj {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rectangle = scn.nextInt();
        int breadth = scn.nextInt();
        Area ans = new Area(rectangle, breadth);
        System.out.println(ans.rectangle * ans.breadth);
    }
}
