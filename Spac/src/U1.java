public class U1 extends Rocket {

    U1(){
        super();
        this.setMaxWeight(18);
        cost=100;
    }

    @Override
    public boolean launch() {

        int chance= (int)(Math.random()*100)+1;
        float multi =(this.getCarriedWeight() / this.getMaxWeight());
        this.chanceOfLauchExplosion = chance; //* multi;
        if(this.chanceOfLauchExplosion < 96)
            return true;
        else
            return false;
    }

    @Override
    public boolean land() {
        int chance= (int)(Math.random()*100)+1;
        float multi =(this.getCarriedWeight() / this.getMaxWeight());
        this.chanceofLandingCrash = chance;// * multi;
        if(this.chanceofLandingCrash<99)
            return true;
        else
            return false;
    }
}
