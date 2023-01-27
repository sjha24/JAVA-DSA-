import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

class upsc_Asspriant{
    private String name;
    private String favPost;
    private int numOFYearForPrepration;
    private String areYouFrom;
    private String DOB;
    ArrayList<String>subjects = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String NewName) {
        name = NewName;
    }
    public String getFavPost() {
        return favPost;
    }
    public void setFavPost(String NewfavPost) {
        favPost = NewfavPost;
    }
    public int getNumOFYearForPrepration() {
        return numOFYearForPrepration;
    }
    public void setNumOFYearForPrepration(int NewnumOFYearForPrepration) {
        numOFYearForPrepration = NewnumOFYearForPrepration;
    }
    public String getAreYouFrom() {
        return areYouFrom;
    }
    public void setAreYouFrom(String NewareYouFrom) {
        areYouFrom = NewareYouFrom;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String NewdOB) {
        DOB = NewdOB;
    }
    upsc_Asspriant(){};
    //<--------------------shallow copy constructor-------------------------->

    // upsc_Asspriant(upsc_Asspriant other){
    //     name =  other.name;
    //     DOB = other.DOB;
    //     areYouFrom = other.areYouFrom;
    //     numOFYearForPrepration = other.numOFYearForPrepration;
    //     favPost = other.favPost;
    //     subjects = other.subjects;
    // }

    //<----------------------deep copy constructor--------------------------------->

    upsc_Asspriant(upsc_Asspriant other){
        name =  other.name;
        DOB = other.DOB;
        areYouFrom = other.areYouFrom;
        numOFYearForPrepration = other.numOFYearForPrepration;
        favPost = other.favPost;
        subjects = new ArrayList<>();
        for(String subject : other.subjects){
            subjects.add(subject);
        }
    }
}
public class deepCopyConstructor{
    public static void main(String[] args) {
        upsc_Asspriant s1 = new upsc_Asspriant();
        s1.setName("Saurav");
        s1.setDOB("24/02/1998");
        s1.setAreYouFrom("Bihar");
        s1.setNumOFYearForPrepration(2);
        s1.setFavPost("IAS");
        s1.subjects.add("Mordern Histroy");
        s1.subjects.add("Medival Histroy");
        s1.subjects.add("Accient Histroy");
        System.out.println(s1.subjects+"s1");        
        //shallo copy constructor call
        upsc_Asspriant s2 = new upsc_Asspriant(s1);
        System.out.println(s2.getName());
        System.out.println(s2.getDOB());
        System.out.println(s2.getAreYouFrom());
        System.out.println(s2.getNumOFYearForPrepration());
        System.out.println(s2.getFavPost());
        System.out.println(s2.subjects+"s2");

        s1.subjects.add("Ethics");
        System.out.println(s1.subjects+"s1");
        System.out.println(s2.subjects+"s2");

        s2.subjects.add("Polity");
        System.out.println(s1.subjects+"s1");
        System.out.println(s2.subjects+"s2");
      
    }
}