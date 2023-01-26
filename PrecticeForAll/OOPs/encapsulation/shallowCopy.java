import java.util.ArrayList;

class upscAsspriant{
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
    upscAsspriant(){};
    //<--------------------shallow copy constructor-------------------------->
    upscAsspriant(upscAsspriant other){
        name =  other.name;
        DOB = other.DOB;
        areYouFrom = other.areYouFrom;
        numOFYearForPrepration = other.numOFYearForPrepration;
        favPost = other.favPost;
        subjects = other.subjects;
    }

    
}
public class shallowCopy{
    public static void main(String[] args) {
        upscAsspriant s1 = new upscAsspriant();
        s1.setName("Saurav");
        s1.setDOB("24/02/1998");
        s1.setAreYouFrom("Bihar");
        s1.setNumOFYearForPrepration(2);
        s1.setFavPost("IAS");
        s1.subjects.add("Mordern Histroy");
        s1.subjects.add("Medival Histroy");
        s1.subjects.add("Accient Histroy");
        System.out.println(s1.subjects);        
        //shallo copy constructor call
        upscAsspriant s2 = new upscAsspriant(s1);
        System.out.println(s2.getName());
        System.out.println(s2.getDOB());
        System.out.println(s2.getAreYouFrom());
        System.out.println(s2.getNumOFYearForPrepration());
        System.out.println(s2.getFavPost());
        System.out.println(s2.subjects);

        s1.subjects.add("Ethics");
        System.out.println(s1.subjects);
        System.out.println(s2.subjects);

        s2.subjects.add("Polity");
        System.out.println(s1.subjects);
        System.out.println(s2.subjects);
    }
}