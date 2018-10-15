import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Item item1= new Item();
        item1.setWeight(1);
        Item item2=new Item();
        item2.setWeight(5);

        U1 u11 =new U1();

        u11.carry(item1);
        u11.carry(item2);
        System.out.println(u11.getCarriedWeight()+" "+u11.getMaxWeight());

        Simulation sim=  new Simulation();
        ArrayList<Item> items=sim.loadItems("Phase-1");
        ArrayList<Item> items2=sim.loadItems("Phase-2");

        ArrayList<Rocket> u1s= sim.loadU1(items);
        ArrayList<Rocket> u2s= sim.loadU1(items);
        ArrayList<Rocket> u1s2= sim.loadU1(items2);
        ArrayList<Rocket> u2s2= sim.loadU1(items2);

        int cost1ForPhase1 =sim.runSimulation(u1s);
        int cost2ForPhase1 =sim.runSimulation(u2s);
        int cost1ForPhase2 =sim.runSimulation(u1s2);
        int cost2ForPhase2 =sim.runSimulation(u2s2);

        System.out.println("cost1ForPhase1: "+cost1ForPhase1);
        System.out.println("cost2ForPhase1: "+cost2ForPhase1);
        System.out.println("cost1ForPhase2: "+cost1ForPhase2);
        System.out.println("cost2ForPhase2: "+cost2ForPhase2);


        /*for (Item item:items
             ) {
            System.out.println("Name:"+item.getName()+" Weight:"+item.getWeight());
        }*/


    }
}
