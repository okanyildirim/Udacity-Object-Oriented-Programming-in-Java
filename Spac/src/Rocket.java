public class Rocket implements SpaceShip {
    private int carriedWeight;
    private int maxWeight;
    protected double chanceOfLauchExplosion;
    protected double chanceofLandingCrash;
    protected int cost;


    Rocket(){
        carriedWeight=0;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCarriedWeight() {
        return carriedWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setCarriedWeight(int carriedWeight) {
        this.carriedWeight = carriedWeight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
       int tempCarriedWeight= carriedWeight;
        tempCarriedWeight+=item.getWeight();
        if(tempCarriedWeight>maxWeight)
            return false;
        else
            return true;
    }

    @Override
    public void carry(Item item) {
        carriedWeight+=item.getWeight();
    }
}
