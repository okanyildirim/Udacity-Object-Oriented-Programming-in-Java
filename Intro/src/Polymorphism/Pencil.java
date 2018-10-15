package Polymorphism;

public class Pencil extends Item implements Tool,Couple{

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void SayOwner(String owner) {
        System.out.println("My owner is "+ owner);
    }

    @Override
    public void Intro() {
        System.out.println("I am a pencil");
    }

    public void Doit(){

        System.out.println("I write");
    }

    @Override
    public void isUsedFor(String verb) {

        System.out.println("I am used for "+verb);
    }

    @Override
    public void SayMaterial() {
        System.out.println("My material is wood");
    }

    @Override
    public void myCouple(String couple) {
        System.out.println("My couple is "+couple);
    }
}
