public class constructorInheritance {
    public static void main(String[] args) {
        //parent obj = new parent();
        user u1 = new user();

        //child obj = new child();
        
        registredUser u2 = new registredUser();
        registredUser u3 = new registredUser("Saurav",'M',"saurav@hotstar.com","9315307748");
        System.out.println(u3.getName());
        System.out.println(u3.getGender());
        System.out.println(u3.getEmail());
        System.out.println(u3.getPhoneNum());
        //grandchild obj = new grandchild();
        // suscribedUser u3 = new suscribedUser();


    }
}
