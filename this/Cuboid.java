
public class Cuboid {
    int length;
    int breadth;
    int height;
    //parametrized Cunstructor :: Cuboid
    Cuboid(int length, int breadth , int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    //default explicit constructor :: Unit Cube
    Cuboid(){
        this(1);
        // this.length = 1;
        // this.breadth = 1;
        // this.height = 1;
    }
    //parametrized Cunstructor :: cube
    Cuboid(int side){
        this(side,side,side);
        // this.length = side;
        // this.breadth = side;
        // this.height = side;
    }
    //parametrize Cunstructor :: rectengle
    Cuboid(int length , int breadth){
       this(length,breadth,0);
        // this.length = length;
        // this.breadth = breadth;
        // this.height = 0;
    }
    Cuboid join(Cuboid other){
        Cuboid third = new Cuboid();
        third.length = this.length+other.length;
        third.breadth = this.breadth+other.breadth;
        third.height = this.height+other.height;
        return third;
    }
    Cuboid merge(Cuboid other){
        this.length += other.length;
        this.breadth += other.breadth;
        this.height += other.height;
        Aap.storeCuboid(this);//pass this as Parameter;
        return this;//return this;
    }
}

class Aap{
    public static void storeCuboid(Cuboid c){
        System.out.println("Data sotre in Cloud");
    }
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(1,5,4);
        Cuboid c2 = new Cuboid(4,2,5);
        Cuboid res = c1.join(c2);
        System.out.println(res.length+" "+res.breadth+" "+res.height);

        c1 = c1.merge(c2);
        System.out.println(c1.length+" "+c1.breadth+" "+c1.height);
        
        Cuboid cu1 = new Cuboid(4,2,1);
        Cuboid cu2 = new Cuboid(4,2,0);
        Cuboid cu3 = new Cuboid(4);
        Cuboid cu4 = new Cuboid();
        System.out.println(cu1.length+" "+cu1.height+" "+cu1.breadth);
        System.out.println(cu2.length+" "+cu2.breadth);
        System.out.println(cu3.length+" "+cu3.breadth+" "+cu3.height);
        System.out.println(cu4.length+" "+cu4.breadth+" "+cu4.height);
    }
}
