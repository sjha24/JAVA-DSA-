class parent{
    public void fun(){
        System.out.println("This is public fun");
    }
    protected void func(){
        System.out.println("This is Protected fun");
    }
    void funct(){
        System.out.println("This is Default fun");
    }
    private void function(){
        System.out.println("This is private fun");
    }
}
class child extends parent{
    // private void fun(){}//not possible to reduce visibelety(public to private not possible)
    @Override
    public void fun(){};
    @Override
    // private void func(){};not possible
    protected void func(){};
    

}