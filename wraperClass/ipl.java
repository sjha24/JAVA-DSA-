import java.util.HashMap;

public class ipl {
    static HashMap<String, Integer>iplTeam = new HashMap<>();
    static{
        //as soon as class is load it will be run
        iplTeam.put("CSK", 1);
        iplTeam.put("DC", 0);
        iplTeam.put("MI", 2);
        iplTeam.put("RCB", 3);
        iplTeam.put("GL", 0);
        System.out.println("Hello static block");
    }
    // ipl(){
        //intialize static properties using constructor
        // iplTeam.put("CSK", 1);
        // iplTeam.put("DC", 0);
        // iplTeam.put("MI", 2);
        // iplTeam.put("RCB", 3);
        // iplTeam.put("GL", 0);
        // System.out.println("Hello ipl obj");
    // }
    public static void main(String[] args) {
    //     System.out.println("Hello main");
    //     ipl obj = new ipl();
    //     System.out.println(obj.iplTeam);
    }
}
