interface Icamera{
    void clickPicture();//by default public , abstract
    void open();
    //default method(Public access modifier)
    default void lens(){
        System.out.println("Camera have a Lens");
    }
}
interface Icall{
    void call();
     void open();
}
interface IvideoCall extends Icall{
    public void videoChat();
}
class torch{
     void open(){
        System.out.println("on/off");
    }
}
class mobilePhone extends torch implements Icamera, IvideoCall{
    @Override
    public void clickPicture(){
        System.out.println("Click Picture");
    }
    @Override
    public void call(){
        System.out.println("Calling your fab");
    }
    @Override
    public void open(){
        super.open();
        System.out.println("Open your mobile");
    }
    @Override
    public void videoChat(){
        System.out.println("Start video chat");
    }
}
public class interfaceFun {
    public static void main(String[] args) {
        Icamera f1 = new mobilePhone();
        f1.clickPicture();
        f1.open();
        Icall f2 = new mobilePhone();
        f2.call();
        f2.open();
        mobilePhone f3 = new mobilePhone();
        f3.clickPicture();
        f3.call();
        f3.open();
        torch f4 = new mobilePhone();
        f4.open();
        IvideoCall f5 = new mobilePhone();
        f5.videoChat();
    }   
}
