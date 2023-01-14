
public class app {
    public static void main(String[] args) {
        // user u1 = new user();
        // u1.setName("Pritam Jha");
        // u1.setGender('M');
        // u1.setDateOfBirth("24/2/2000");
        // System.out.println(u1.getName());
        // System.out.println(u1.getGender());
        // System.out.println(u1.getDateOfBirth());
        // u1.viewShowListing();
        // registredUser reg = new registredUser();
        
        // reg.setName("Subham Rajput");
        // reg.setGender('M');
        // reg.setDateOfBirth("12/06/1998");
        // reg.setEmail("subham@gmail.com");
        // reg.setPhoneNum("8405819908");

        // System.out.println(reg.getName());
        // System.out.println(reg.getGender());
        // System.out.println(reg.getEmail());
        // System.out.println(reg.getDateOfBirth());
        // System.out.println(reg.getPhoneNum());
        // reg.viewShowListing();
        // reg.viewFreeShowes();

        // suscribedUser pr = new suscribedUser();
        // pr.setName("Saurav Jha");
        // pr.setGender('M');
        // pr.setEmail("sauravnhk@gmail.com");
        // pr.setPhoneNum("9315307748");
        // pr.setPlan("999");
        // pr.setValidity("1 Year");
        // pr.viewPremiumContent();
        // pr.viewFreeShowes();
        // pr.viewShowListing();
        admin staff = new admin();
        staff.setName("Saurav Jha");
        staff.setGender('M');
        staff.setEmail("saurav@hotstar.com");
        staff.setStaff_Id("S1012");
        staff.setPhoneNum("9315307748");
        System.out.println(staff.getName());
        System.out.println(staff.getGender());
        System.out.println(staff.getDateOfBirth());
        System.out.println(staff.getPhoneNum());
        System.out.println(staff.getStaff_Id());
        staff.viewFreeShowes();
        staff.viewShowListing();
        staff.editShow();
         
    }
}
