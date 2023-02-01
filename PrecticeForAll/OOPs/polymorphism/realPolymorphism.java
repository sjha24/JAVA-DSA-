class car{
    private String name;
    private String price;
    private String color;
    private double rating;
    public car(){};
    public car(String name, String price, String color, double rating) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void carName(){
        System.out.println("Maruti alto 800");
    }
    public void carEnergy(){
        System.out.println("Diseal");
    }
    public void carUser(){
        System.out.println("Normal user");
    }
    
    public void enviromentalEffect(){
        System.out.println("Badely impact on enveiroment");
    }
    public void carOnwer(){
        System.out.println("Saurav Jha");
    }
}
class Petrolcar extends car{
    @Override
    public void carName(){
        System.out.println("Mercedese benz");
    }
    @Override
    public void carEnergy(){
        System.out.println("Petrol energy");
    }
    @Override
    public void carUser(){
        System.out.println("Higher Medium user");
    }
    @Override
    public void enviromentalEffect(){
        System.out.println("compare to diseal good fuel(petrol)");
    }

}
class cngCar extends car{
    @Override
    public void carName(){
        System.out.println("Maruti");
    }
    @Override
    public void carEnergy(){
        System.out.println("CNG energy");
    }
    @Override
    public void carUser(){
        System.out.println("Uper medium user");
    }
    @Override
    public void enviromentalEffect(){
        System.out.println("compare to diseal best fuel(CNG)");
    }
}
class electricCar extends car{
    @Override
    public void carName(){
        System.out.println("Tesla");
    }
    @Override
    public void carEnergy(){
        System.out.println("Electric energy");
    }
    @Override
    public void carUser(){
        System.out.println("Reich user");
    }
    @Override
    public void enviromentalEffect(){
        System.out.println("puer enviroment friendely");
    }
}

public class realPolymorphism {
    public static void main(String[] args) {
        car c1 = new car();
        c1.setName("Desiel car");
        c1.setColor("Black");
        c1.setPrice("432125");
        c1.setRating(3.6);
        System.out.println(c1.getName());
        System.out.println(c1.getColor());
        System.out.println(c1.getPrice());
        System.out.println(c1.getRating());
        c1.carName();
        c1.carUser();
        c1.carEnergy();
        c1.enviromentalEffect();
        c1.carOnwer();

        car c2 = new Petrolcar();
        c2.setName("Mercedese");
        c2.setColor("White");
        c2.setPrice("5424363");
        c2.setRating(6.9);
        c2.carOnwer();//car(parent);
        System.out.println(c2.getName());
        System.out.println(c2.getColor());
        System.out.println(c2.getPrice());
        System.out.println(c2.getRating());
        c2.carName();
        c2.carUser();
        c2.carEnergy();
        c2.enviromentalEffect();
        c2.carOnwer();//c1(parent);

        car c3 = new cngCar();
        c3.setName("Maruti");
        c3.setColor("White");
        c3.setPrice("542433");
        c3.setRating(4.9);
        System.out.println(c3.getName());
        System.out.println(c3.getColor());
        System.out.println(c3.getPrice());
        System.out.println(c3.getRating());
        c3.carName();
        c3.carUser();
        c3.carEnergy();
        c3.enviromentalEffect();
        c3.carOnwer();//c1(parent);

        car c4 = new electricCar();
        
        c4.setName("Tesla");
        c4.setColor("White");
        c4.setPrice("5524363");
        c4.setRating(7.9);
        System.out.println(c4.getName());
        System.out.println(c4.getColor());
        System.out.println(c4.getPrice());
        System.out.println(c4.getRating());
        c4.carName();
        c4.carUser();
        c4.carEnergy();
        c4.enviromentalEffect();
        c4.carOnwer();//c1(parent);
    }
}
