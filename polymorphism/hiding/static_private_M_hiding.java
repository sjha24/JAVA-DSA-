class parent{
    String name;
    public static void publicFun(){
        System.out.println("I am publicFun of Parent class");
    }
    private void privateFun(){
        System.out.println("I am privateFun of parent class");
    }
    public void pubFun(){
        System.out.println("I am publicFun with zero parameter of parent class");
    }

}
class child extends parent{
    public static void publicFun(){
        System.out.println("I am publicFun of child class");
    }
    private void privateFun(){
        System.out.println("I am privateFun of child class");
    }
    public void pubFun(int data){
        System.out.println("I am publicFun with one parameter of child class");
    }
}
public class static_private_M_hiding{
    public static void main(String[] args) {
        parent obj1 = new parent();
        obj1.name = "Saurav";
        obj1.publicFun();//parent
        obj1.pubFun();//parent
        child obj2 = new child();
        obj2.publicFun();//child
        obj2.pubFun();//parent
        obj2.pubFun(45);//child
        parent obj3 = new child();
        obj3.pubFun();//parent
        // obj3.publicFun();
    }
}