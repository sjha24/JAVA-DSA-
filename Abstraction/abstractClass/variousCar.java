abstract class car{
    abstract void reFuel();
    abstract void engineType();
    abstract void colorOFCar();
}
class petrolCar extends car{
    public void reFuel(){
        System.out.println("Petrol filling in car");
    }
    public void engineType(){
        System.out.println("Petrol Engine");
    }
    public void colorOFCar(){
        System.out.println("Black");
    }
}
class solarCar extends car{
    public void reFuel(){
        System.out.println("Battery recharge by sun Energy");
    }
    public void engineType(){
        System.out.println("Solar Engine");
    }
    public void colorOFCar(){
        System.out.println("Red");
    }
}
public class variousCar{
    public static void main(String[] args) {
        // car obj = new car();//can not be instantiate(object)

        petrolCar ob = new petrolCar();
        ob.colorOFCar();
        ob.reFuel();
        ob.engineType();

        solarCar ob1 = new solarCar();
        ob1.colorOFCar();
        ob1.reFuel();
        ob1.engineType();
        //polymorphism
        car c1 = new petrolCar();
        c1.engineType();
        c1.colorOFCar();
        c1.reFuel();

        car c2 = new solarCar();
        c2.engineType();
        c2.colorOFCar();
        c2.reFuel();
    }
}