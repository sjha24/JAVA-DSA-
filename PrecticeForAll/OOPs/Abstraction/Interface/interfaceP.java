interface Icamera{
    void clickPicture();//public and abstract by default
     void open();
    default void lens(){//default method(non abstract fun)) is exception
        System.out.println("Camera has a best lens");
    }
    static void zoom(){
        System.out.println("Camera zoom");
    }
}
interface Icall{
     void call();
     void open();
}
interface IvideoCall extends Icall{
    void voideoCall();
}
class torch{
     void open(){
        System.out.println("Torch on / off");
    }
}
class cellPhone extends torch implements Icamera,IvideoCall{
    @Override
     public void clickPicture(){
        System.out.println("Open camera and click once my pic");
    }
    @Override
    public void open(){
        super.open();
        System.out.println("Open your mobile and call your mom");
    }
    @Override
    public void call(){
        System.out.println("give me your phone for call my happiness");
    }
    @Override
    public void voideoCall(){
        System.out.println("Call me video call");
    }
}
public class interfaceP {
    public static void main(String[] args) {
        Icamera c1 = new cellPhone();
        c1.clickPicture();
        c1.open();
        c1.lens();

        Icall c2 = new cellPhone();
        c2.call();
        c2.open();

        cellPhone c4 = new cellPhone();
        c4.clickPicture();
        c4.call();
        c4.open();
        c4.lens();

        Icamera.zoom();
    }
}
