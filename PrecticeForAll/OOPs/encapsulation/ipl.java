import java.util.HashMap;

public class ipl {
    static HashMap<String,Integer>team = new HashMap<>();
    //static block

    static{
        team.put("CSK", 0);
        team.put("MI", 0);
        team.put("GL", 0);
        team.put("DD", 0);
        team.put("RCB", 0);
    }
    // ipl(){
    //     team.put("CSK", 0);
    //     team.put("MI", 0);
    //     team.put("GL", 0);
    //     team.put("DD", 0);
    //     team.put("RCB", 0);
    // }
}
class staticKey2{
    public static void main(String[] args) {
        // ipl obj = new ipl();
        // System.out.println(obj.team);
        System.out.println(ipl.team);
    }
}
