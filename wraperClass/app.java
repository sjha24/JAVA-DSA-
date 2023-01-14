import java.util.ArrayList;

// package wraperClass;
class MyInteger{
    private int data;

    public MyInteger(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public void setData(int data){
        this.data = data;
    }
}
public class app {
    // @SuppressWarnings("all")
    public static void main(String[] args) {
        // int marks = 100;
        // System.out.println(marks);
        // Integer value = new Integer(100);
        // System.out.println(value);

        // int arr[] = {10,20,30};
        // System.out.println(arr);

        // ArrayList<Integer>data = new ArrayList<>();
        // data.add(10);
        // data.add(40);
        // data.add(20);
        // data.add(50);
        // System.out.println(data);

        // Integer  val1 = Integer.MAX_VALUE;
        // Integer  val2 = Integer.MIN_VALUE;
        // Integer  val3 = Integer.parseInt("01234");

        // Character ch = new Character('A');
        // System.out.println(Character.toLowerCase(ch));

        // MyInteger val = new MyInteger(50);
        // System.out.println(val);
        // System.out.println(val.getData());
        // val.setData(100);
        // System.out.println(val.getData());

        //<---------------AutoBoxing-------------->

        Integer val1 = new Integer(5);
        Integer val = 5;
        System.out.println(val);
        Character ch = new Character('a');
        Character ch1 = 'a';
        System.out.println(ch);

        //<-------------unboxing------------------>
        int val3 = val1;//storing int ->integer
        System.out.println(val3);

    }
}
