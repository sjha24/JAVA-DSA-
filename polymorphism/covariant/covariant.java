class parent{
    public void fun(){
        System.out.println("This is parent fun");
    }
    public parent getObject(){
        System.out.println("This is parent getobj");
        return new parent();
    }
    public void getIAS(){
        System.out.println("I am an IAS officer");
    }
}
class child extends parent{
    @Override
    public void fun(){
        System.out.println("This is child fun");
    }
    @Override
    public child getObject(){
        System.out.println("This is child getobj");
        return new child();
    }
    public void getIPS(){
        System.out.println("I am an IPS Officer");
    }
}
class covariant{
    public static void main(String[] args) {
        parent obj1 = new parent();
        child obj2 = new child();

        parent obj3 = obj1.getObject();//parent
        //child ref = parent object
        obj3.fun();//parent
        obj3.getIAS();//paremt
        parent obj4 = obj2.getObject();//override
        //parent ref = child object
        obj4.getIAS();
        
        child obj5 = obj2.getObject();
        //child ref = child object 
        obj5.getIAS();
        obj5.getIPS();
    }
}