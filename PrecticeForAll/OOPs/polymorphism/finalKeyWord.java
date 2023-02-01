import java.util.ArrayList;

class poor {
    final private String name;
    final private int numOfFamilyMember;
    final private String educarionLevel;
    final ArrayList<String> familyMemverName;// stack reference variabel name is final not vaule(heap) final;

    public poor(String name, int numOfFamilyMember, String educarionLevel) {
        this.name = name;
        this.numOfFamilyMember = numOfFamilyMember;
        this.educarionLevel = educarionLevel;
        familyMemverName = new ArrayList<>();

    }

    poor() {
        this.name = "Saurav";
        this.numOfFamilyMember = 6;
        this.educarionLevel = "12th pass";
        familyMemverName = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumOfFamilyMember() {
        return numOfFamilyMember;
    }

    public String getEducarionLevel() {
        return educarionLevel;
    }

    public ArrayList<String> getFamilyMemverName() {
        return familyMemverName;
    }

}

public class finalKeyWord {
    public static void main(String[] args) {
        poor p1 = new poor("Papu",5 , "12th pass");
        poor p2 = new poor();
        p2.familyMemverName.add("Rehana Devi");
        p2.familyMemverName.add("gobar kora");
        p2.familyMemverName.add("musa kora");
        p2.familyMemverName.add("binda Kora");
        p2.familyMemverName.add("likwa kroi");
        System.out.println(p1.getName());
        System.out.println(p1.getEducarionLevel());
        System.out.println(p1.getNumOfFamilyMember());

        for (int i = 0; i < p2.familyMemverName.size(); i++) {
            System.out.println(p2.familyMemverName.get(i));
        }
    }
}