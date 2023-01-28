import java.util.ArrayList;
class myInteger{
    private int data;

    public myInteger(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
public class wraperClassDemo {
    
    public static void main(String[] args) {
        // int marks = 100;//stack(premitive data);
        // System.out.println(marks);
        // Integer marks2 = new Integer(100);
        // System.out.println(marks2);
        // Integer minVale = Integer.MIN_VALUE;
        // Integer maxVale = Integer.MAX_VALUE;
        // Integer val = Integer.parseInt("7214");
        // System.out.println(minVale+" "+maxVale+" "+val);

        // String name = new String("Saurav");//print saurav
        // int arr[] = {1,2,34,5};//print hashcode
        // ArrayList<Integer>array = new ArrayList<>();
        // array.add(5);
        // array.add(15);
        // array.add(25);
        // array.add(24);
        // array.add(23);
        // System.out.println(arr);//print value[5,15,25,24,23]

        // Character ch = new Character('A');
        // System.out.println(Character.toLowerCase(ch));
        // System.out.println(Character.isUpperCase(ch));
        // System.out.println(Character.isLowerCase(ch));
        // System.out.println(Character.isAlphabetic(ch));

        myInteger val = new myInteger(50);
        System.out.println(val);//print hash code

        System.out.println(val.getData());//print data :- 50
        val.setData(78);
        System.out.println(val.getData());//78

        Character ch1 = new Character('a');
        Character ch2 = 'a';//autoboxing

        Integer v = new Integer(20);
        Integer v1 = 20;//autoboxing; Integer store int(20)
        int num = v1;//int store Integer(20)  unboxing
    }
}
