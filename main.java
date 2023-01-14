public class main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Saurav";
        s1.marks = 75;
        s1.Gender = 'M';
        s1.rollNum = 24;
        s1.study();
        s1.play("Beadminton");
        System.out.println(s1.getResult());
        s1.setRollNo(224);
        System.out.println(s1.rollNum);
    }
}
