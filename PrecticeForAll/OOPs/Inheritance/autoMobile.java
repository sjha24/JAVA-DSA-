class vechiel{
    private String name;
    private String engine;
    private String gearBoxType;
    private String color;
    private String seat;
    public String getEngine() {
        return engine;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getGearBoxType() {
        return gearBoxType;
    }
    public void setGearBoxType(String gearBoxType) {
        this.gearBoxType = gearBoxType;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
class car extends vechiel{
    private String seatBelt;
    private String roof;
    private String ac;
    private String windowShield;
    public String getSeatBelt() {
        return seatBelt;
    }
    public void setSeatBelt(String seatBelt) {
        this.seatBelt = seatBelt;
    }
    public String getRoof() {
        return roof;
    }
    public void setRoof(String roof) {
        this.roof = roof;
    }
    public String getAc() {
        return ac;
    }
    public void setAc(String ac) {
        this.ac = ac;
    }
    public String getWindowShield() {
        return windowShield;
    }
    public void setWindowShield(String windowShield) {
        this.windowShield = windowShield;
    }
}
class motercycyle extends vechiel{
    private String stands;
    private String handle;
    public String getStands() {
        return stands;
    }
    public void setStands(String stands) {
        this.stands = stands;
    }
    public String getHandle() {
        return handle;
    }
    public void setHandle(String handle) {
        this.handle = handle;
    }
}
public class autoMobile {
    public static void main(String[] args) {
        car mercedes = new car();
        mercedes.setName("Mercedes Benz");
        mercedes.setColor("White");
        mercedes.setEngine("5 stroke");
        mercedes.setRoof("Adjustable");
        mercedes.setWindowShield("Yes");
        mercedes.setAc("Yes");
        mercedes.setGearBoxType("Advance gear box");
        mercedes.setSeatBelt("Please wear seat belt for safe jorney");

        System.out.println(mercedes.getName());
        System.out.println(mercedes.getColor());
        System.out.println(mercedes.getEngine());
        System.out.println(mercedes.getSeat());
        System.out.println(mercedes.getSeatBelt());
        System.out.println(mercedes.getGearBoxType());
        System.out.println(mercedes.getRoof());
        System.out.println(mercedes.getWindowShield());
       
        motercycyle ktm = new motercycyle();
        ktm.setName("KTM RC 390");
        ktm.setColor("Blue");
        ktm.setEngine("373 cc");
        ktm.setGearBoxType("Advance");
        ktm.setHandle("Yes");
        ktm.setSeat("Two seater");
        ktm.setStands("Yes");

        System.out.println(ktm.getName());
        System.out.println(ktm.getColor());
        System.out.println(ktm.getEngine());
        System.out.println(ktm.getGearBoxType());
        System.out.println(ktm.getHandle());
        System.out.println(ktm.getSeat());
        System.out.println(ktm.getStands());
    }
}
