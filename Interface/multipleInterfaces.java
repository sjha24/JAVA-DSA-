interface radio{
    void isRadioFacility();
}
interface autoDrive{
    void isAutoDriveFacility();
}
interface isAutoBreakingSystem{
    void isAutoBreakingSysteminThisCar();
}
interface car{
    String carColor = "Black";
    void fuilType();
    void carBrand();
    void carModel();
    void isRearCamera();
    void carPrice();
}
class myCar implements car,radio,autoDrive,isAutoBreakingSystem{
    public void fuilType(){
        System.out.println("Petrol");
    }
    public void carBrand(){
        System.out.println("Mercedes Benz");
    }
    public void carModel(){
        System.out.println(" A-Class Limousine");
    }
    public void isRearCamera(){
        System.out.println("Yes Rear Carmera Avilabel");
    }
    public void isAutoDriveFacility(){
        System.out.println("Yes you can Enjoy Auto Driving Facility");
    }
    public void isAutoBreakingSysteminThisCar(){
        System.out.println("Yes you can Enjoy Auto Breaking System");
    }
    public void isRadioFacility(){
        System.out.println("Yes in this car Radio Facility Also Avilabel");
    }
    public void carPrice(){
        System.out.println("42 to 44 lacks");
    }
}
public class multipleInterfaces {
    public static void main(String[] args) {
        myCar marcedes = new myCar();
        marcedes.carPrice();
        marcedes.carBrand();
        marcedes.carModel();
        marcedes.fuilType();
        marcedes.isAutoDriveFacility();
        marcedes.isAutoBreakingSysteminThisCar();
        marcedes.isRearCamera();
        marcedes.isRadioFacility();
    }
}
