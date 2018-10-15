package Polymorphism;

public class ExecPol {

    public static void main(String[] args) {

        Item bag= new Bag();
        Item pencil =new Pencil();

        bag.setId(1);
        pencil.setId(2);

        System.out.println("Bag id: "+bag.getId()+ "  Pencil id: "+ pencil.getId());

        bag.Intro();
        pencil.Intro();

        // Type casting is required when individual methods are used for each class itself.
        // Doit method is special for each sub class and it is not defined in abstract class
        ((Bag) bag).Doit();
        ((Pencil)pencil).Doit();

        // For avoid this abstract class can be used.
        // SayOwner is abstract class
        bag.SayOwner("Okan");
        pencil.SayOwner("Hilal");

        //These are methods from interafce. Interface is used because a class have only one superior class.
        ((Bag) bag).isUsedFor("Carrying books");
        ((Bag) bag).SayMaterial();

        ((Pencil) pencil).isUsedFor("Writing");
        ((Pencil) pencil).SayMaterial();

        ((Pencil) pencil).myCouple("Paper");

        Tool pencil2 = new Pencil();

        pencil2.SayMaterial();
        ((Pencil) pencil2).SayOwner("Okan");

        ((Bag) bag).addItem(pencil);

        Pencil pencil5= new Pencil();
        pencil5.setWeight(10);
        ((Bag) bag).addItem(pencil5);
    }
}
