abstract class weatherAPI{
    abstract void getTemperature();
    abstract void getHumidity();
}
class weather extends weatherAPI{
    @Override
    public void getTemperature(){
        System.out.println("30degree celcius");
    }
    @Override
    public void getHumidity(){
        System.out.println("2 % humidity in capital of Bihar");
    }
}
public class weatherApp{
    public static void main(String[] args) {
        weatherAPI app = new weather();
        app.getTemperature();
        app.getHumidity();
    }
}