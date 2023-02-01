interface car{
    public void getCarName();
    public void getCarFuelType();
    public void getCarPrice();
    public void getCarUser();
    public void impacetOfEnviroment();
}
class maruti implements car{
    public void getCarName(){
        System.out.println("Maruti car");
    }
    public void getCarFuelType(){
        System.out.println("Petrol");
    }
    public void getCarPrice(){
        System.out.println("413254");
    }
    public void getCarUser(){
        System.out.println("Middle class");
    }
    public void impacetOfEnviroment(){
        System.out.println("Badely impact on enviroment this type of fuel");
    }
}
class tesla implements car{
    public void getCarName(){
        System.out.println("Tesla car");
    }
    public void getCarFuelType(){
        System.out.println("Electric or Battery(Rechargebal)");
    }
    public void getCarPrice(){
        System.out.println("1913254");
    }
    public void getCarUser(){
        System.out.println("Upper Middle class");
    }
    public void impacetOfEnviroment(){
        System.out.println("enviroment friendely this type of fuel");
    }
}
public class vechile{
    public static void main(String[] args) {
        car c1 = new maruti();
        c1.getCarName();
        c1.getCarFuelType();
        c1.getCarPrice();
        c1.getCarUser();
        c1.impacetOfEnviroment();

        car c2 = new tesla();
        c2.getCarName();
        c2.getCarFuelType();
        c2.getCarPrice();
        c2.getCarUser();
        c2.impacetOfEnviroment();
    }
}