public class suscribedUser extends registredUser {
    private String plan;
    private String validity;

    public suscribedUser(){
        System.out.println("Subscribed user Constructor");
    }
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public void viewPremiumContent() {
        System.out.println("Premium User");
        System.out.println("View Paid Show");
    }
}
