package Polymorphism;

public abstract class Item {
    private int id;
    private float weight;

    public float getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public abstract void SayOwner(String owner);

    public void Intro(){
        System.out.println("I am an item");
    }
}
