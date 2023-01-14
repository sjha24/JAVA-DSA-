import java.util.Scanner;
//we can have 0 to 100% abstraction;
//no abstraction method is possible;
abstract class googleMapAPI{
    public String getLocation(){
        return "Patna";
    }
    public String getDistance(String source , String destination){
        return "500 KM";
    }
}

//all abstract method is possible
abstract class weatherAPI{
    public abstract String getTemperatue(String city);
    public abstract String getHumidity(String city);
}
// interface :- 
//1.Blue print of a class.
//2. All functons are abstract by default.
//3. All properties are final and static.
//4. we can not create object of interace(Interface can not be instantiated).
//5.They do not have constructor and this Keyword.
//6. there will be no inheritance, but dependency will be there.
interface weatherInterface{
    public void getTemperature(String city);
    public void getHumidity(String city);
}
class weatherReport implements weatherInterface{
    public void getTemperature(String city){
        System.out.println("Get temp");
    }
    public void getHumidity(String city){
        System.out.println("Get Humidity");
    }
}
//abstract class having some function abstract or some function non abstract
abstract class newsAPI{
    public String getHeadline(){
        return "Congress won in Himachal pardesh";
    }
    public abstract String getLatestNews();
}
//concreate class(Implimantation) depend on abstract class(Abstraction).
class news extends newsAPI{
    @Override
    public String getLatestNews(){
        return "IAS Suarav visit his Village";
    }
}
class weather extends weatherAPI{

    @Override
    public String getHumidity(String city) {
        return "30 degree celsius";
    }

    @Override
    public String getTemperatue(String city) {
        return "30 degree precipation";
    }
    
}
public class app{
    public static void main(String[] args) {
        weatherAPI obj = new weather();
        System.out.println(obj.getTemperatue("patna"));
        System.out.println(obj.getHumidity("patna"));
    }
}