class camera{
    public void clickPhoto(){
        System.out.println("Take Pic");
    }
    public void open(){
        System.out.println("Shuter open");
    }
}
class cellPhone{
    public void call(){
        System.out.println("Call My World");
    }
    public void open(){
        System.out.println("Switch on my Cell Phone");
    }
}
class mobile extends cellPhone{
    //multi inheritance 
    //note --> Java not allow multi level Inheritance because it has might to be ambiguity.
    
    //composition (Has a relationship)------->>
    camera cam;
    public void clickPhoto(){
        cam.clickPhoto();
    }
}
public class main{
    public static void main(String[] args) {
        mobile Iphone = new mobile();
        Iphone.cam = new camera();
        Iphone.open();
        Iphone.clickPhoto();
        Iphone.call();
    }

}

