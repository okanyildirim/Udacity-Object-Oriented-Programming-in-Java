import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {


    public ArrayList<Item> loadItems(String phase) throws FileNotFoundException {

        ArrayList<Item> items = new ArrayList<>();
        String pathName = "C:\\Users\\okkaa\\Desktop\\" + phase + ".txt";
        File file = new File(pathName);
        Scanner readfile = new Scanner(file);

        int result = 0;

        while (readfile.hasNextLine()) {
            String line = readfile.nextLine();
            String itemArray[] = line.split("=");
            //System.out.println("Name:"+itemArray[0]+" Weight:"+ itemArray[1]);

            Item item = new Item();
            item.setName(itemArray[0]);
            item.setWeight(Integer.parseInt(itemArray[1]) / 1000);
            items.add(item);
        }
        return items;
    }

    /*loadU1: this method takes the ArrayList of Items returned from loadItems and starts creating U1 rockets.
    It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object and
    filling that one until all items are loaded.The method then returns the ArrayList of those U1 rockets that are fully loaded.*/

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1Filo = new ArrayList<>();
        boolean rocketIsNotFull = true;
        int index =0;
        u1Filo.add(new U1());

        for (Item item : items
                ) {
            if (u1Filo.get(index).canCarry(item)) {
                u1Filo.get(index).carry(item);
            } else {
                u1Filo.add(new U1());
                index++;
                if (u1Filo.get(index).canCarry(item)) {
                    u1Filo.get(index).carry(item);
                }
                else
                    System.out.println(item.getName()+" named item is "+item.getWeight()+ " tone and it is not carried." );
            }
        }
        return u1Filo;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2Filo = new ArrayList<>();
        boolean rocketIsNotFull = true;
        int index =0;
        u2Filo.add(new U2());

        for (Item item : items
                ) {
            if (u2Filo.get(index).canCarry(item)) {
                u2Filo.get(index).carry(item);
            } else {
                u2Filo.add(new U2());
                index++;
                if (u2Filo.get(index).canCarry(item)) {
                    u2Filo.get(index).carry(item);
                }
                else
                    System.out.println(item.getName()+" named item is "+item.getWeight()+ " tone and it is not carried." );
            }
        }
        return u2Filo;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int totalCost = 0;

        for (Rocket rocket : rockets
                ) {
            totalCost += rocket.getCost();
            while (true) {
                while (!rocket.launch()) {
                    totalCost += rocket.getCost();
                }

                if(rocket.land()){
                    break;
                }
                else{
                    totalCost += rocket.getCost();
                }
            }
        }

        return totalCost;
    }
}
