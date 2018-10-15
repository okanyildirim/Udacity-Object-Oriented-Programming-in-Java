package HelloWorld;

public class Student extends People {

    private float gpa;
    private boolean isGraduated;

    Student(){
      super();
        gpa=2;
        isGraduated=false;
    }

    Student(String name,int age, float gpa, boolean isGraduated){
       super(name, age);
        this.gpa=gpa;
        this.isGraduated=true;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    public float getGpa() {
        return gpa;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    @Override
    public void Intro(){
        //super.Intro();
        System.out.println("I am a student");
    }

    public void sayAge(){
        System.out.println("I am "+ this.getAge()+ " years old");
    }
}
