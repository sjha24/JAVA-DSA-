public class main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setRollNumber(5);
        s1.setName("Saurav");
        s1.setGender('M');
        s1.setMarks(95);
        System.out.println(s1.subject);
        s1.subject.add("Java");
        s1.subject.add("Java Script");
        s1.subject.add("Java DSA");
        s1.subject.add("Java Mat");
        System.out.println(s1.subject);
        student s2 = new student(s1);
        System.out.println(s2.subject);
        s1.subject.add("C++");
        System.out.println(s1.subject);
        System.out.println(s2.subject);

        s2.subject.add("Python");
        System.out.println(s1.subject);
        System.out.println(s2.subject);
    }
}
