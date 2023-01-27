class districAdministration{
    private String nameOfDM;
    private String cadder;
    private int sellectionYear;
    private String allocateService;
    private String project;
    private int yearOfposting;
    //this keyWord properties :------------------->
    //1.accessing the data member or properties.
    public districAdministration(String nameOfDM, String cadder, int sellectionYear, String allocateService,
            String project, int yearOfposting) {
        this.nameOfDM = nameOfDM;
        this.cadder = cadder;
        this.sellectionYear = sellectionYear;
        this.allocateService = allocateService;
        this.project = project;
        this.yearOfposting = yearOfposting;
    }
    //2.Accessing the member function
    public String getNameOfDM() {
        return nameOfDM;
    }
    public void setNameOfDM(String nameOfDM) {
        this.nameOfDM = nameOfDM;
    }
    public String getCadder() {
        return cadder;
    }
    public void setCadder(String cadder) {
        this.cadder = cadder;
    }
    public int getSellectionYear() {
        return sellectionYear;
    }
    public void setSellectionYear(int sellectionYear) {
        this.sellectionYear = sellectionYear;
    }
    public String getAllocateService() {
        return allocateService;
    }
    public void setAllocateService(String allocateService) {
        this.allocateService = allocateService;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }
    public int getYearOfposting() {
        return yearOfposting;
    }
    public void setYearOfposting(int yearOfposting) {
        this.yearOfposting = yearOfposting;
    }
}
class cuboid{
    int length;
    int breath;
    int height;

    //parametrised construcor : cuboid
    cuboid (int length, int breath, int height){
        this.length = length;
        this.breath = breath;
        this.height = height;
    }
    //default explicit constructor : unit cube
    cuboid(){
        this(1);//5.construcor chaning
        // this.length = 1;
        // this.breath = 1;
        // this.height = 1;
    };
    //parametrised constructor : cube
    cuboid(int side){
        this(side,side,side);//5.construcor chaning
        // this.length = side;
        // this.breath = side;
        // this.height = side;

    }
    //parametrised constructor : rectengle
    cuboid(int length, int breath){
       this(length,breath,0);//5.construcor chaning
        // this.length = length;
        // this.breath = breath;
        // this.height = 0;
    }
   //not modify original cuboid 
    cuboid join(cuboid other){
        cuboid res = new cuboid();
        res.length = this.length+other.length;
        res.breath = this.breath+other.breath;
        res.height = this.height+other.height;
        return res;
    }

    //3. we can return this

    //modifying original cuboid
    cuboid merge(cuboid other){
        other.length = this.length;
        other.breath = this.breath;
        other.height = this.height;
        this_KeyWord.storeCuboid(this);//4.we can pass this as parameter
        return this;//return this
    }
}
public class this_KeyWord {
    public static void storeCuboid(cuboid c){
        System.out.println("Save data of merger cuboid in cloud");
        //(c1 : this keyword);
    }
    public static void main(String[] args) {

        districAdministration lakhisarai = new districAdministration("Saurav", "Bihar", 2024, "IAS", "Make Smart city", 2025);
        System.out.println(lakhisarai.getNameOfDM());
        System.out.println(lakhisarai.getYearOfposting());
        System.out.println(lakhisarai.getCadder());
        System.out.println(lakhisarai.getAllocateService());
        System.out.println(lakhisarai.getProject());
        System.out.println(lakhisarai.getSellectionYear());

        cuboid c1 = new cuboid(20, 25, 30);   
        cuboid c2 = new cuboid(10, 15, 20);
        //c1 :- this; c2 :- other;
        cuboid res = c1.join(c2);
        System.out.println(res.length+" "+res.breath+" "+res.height);   
        //c1 :- this ; c2 :- other;
        cuboid merge = c1.merge(c2);
        System.out.println(merge.length+" "+merge.length+" "+merge.height);
       
    }
}
