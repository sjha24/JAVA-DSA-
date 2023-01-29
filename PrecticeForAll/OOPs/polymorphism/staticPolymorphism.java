//or2type of polymorphiosm
//1st type -> compile time polymorphism or static polymorphism or method overloading
//2nd type -> run time polymorphism or dynamic polymorphism or method overiding
//1st type-> polymorphism
public class staticPolymorphism{
    public int sum(int a , int b){
        System.out.println("Integer sum");
        return a+b;
    }
    public int sum(int a , int b, int c){
        System.out.println("Integer sum with three parameter");
        return a+b+c;
    }
    public long sum(long a, long b){
        System.out.println("long sum");
        return a+b;
    }
    public double sum(double a, double b){
        System.out.println("Double sum");
        return a+b;
    }
    public String sum(int a , String b){
        System.out.println("integer + String concatination");
        return a+b;
    }
    public String sum(String a, int b){
        System.out.println("String  + Integer concatination(data type order change)");
        return a+b;
    }
    public String sum(String a, String b){
        System.out.println("String concatination");
        return a+b;
    }
    public static void main(String[] args) {
        staticPolymorphism sum = new staticPolymorphism();
        System.out.println(sum.sum("5", 10));
        System.out.println(sum.sum(10, "50"));
        System.out.println(sum.sum("Saurav", "Jha"));
        System.out.println(sum.sum(10, 20));
        System.out.println(sum.sum(10, 20, 30));
        System.out.println(sum.sum(999999999999999999l, 8431377865555555150l));
        System.out.println(sum.sum('a', 'b'));
        System.out.println(sum.sum(9999999999999999999999999999999999999d, 434320d));
    }
}