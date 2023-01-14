public class admin extends registredUser{
    //heirarchial Ingeritance
    private String staff_Id;
    public void editShow(){
        System.out.println("Admin");
        System.out.println("Edit Show");
    }
    public String getStaff_Id() {
        return staff_Id;
    }
    public void setStaff_Id(String staff_Id) {
        this.staff_Id = staff_Id;
    }
}
