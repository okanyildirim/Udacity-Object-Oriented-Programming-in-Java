package HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        People people=new People();
        Student st1=new Student();
        //st1.setGpa((float)2.5);
        Student st2=new Student("Okan",23,4,true);

        System.out.println("\nStudent:"+st1.getName()+" Gpa:"+st1.getGpa()+" isGraduated:"+st1.isGraduated());
        System.out.println("\nStudent:"+st2.getName()+" Gpa:"+st2.getGpa()+" Age:"+st2.getAge());
        people.Intro();
        st1.Intro();
        st2.sayAge();
    }

}
