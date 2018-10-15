package Polymorphism;

public class Bag extends Item implements Tool{

    private int capacity;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void SayOwner(String owner) {
        System.out.println("My owner is "+ owner);
    }

    @Override
    public void Intro() {
        System.out.println("I am a bag");
    }

    public void Doit(){

        System.out.println("I carry");
    }

    @Override
    public void isUsedFor(String verb) {
        System.out.println("I am used for "+verb);
    }

    @Override
    public void SayMaterial() {
        System.out.println("My material is fabric");
    }

    public void addItem(Item item){
        System.out.println(item.getWeight()+ " kg is added");
    }
}