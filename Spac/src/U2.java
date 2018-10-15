public class U2 extends Rocket {


    U2(){
        super();
        this.setMaxWeight(29);
        cost=120;
    }

    @Override
    public boolean launch() {
        int chance= (int)(Math.random()*100)+1;
        float multi =this.getCarriedWeight() / this.getMaxWeight();
        chanceOfLauchExplosion = chance;//* multi;
        if(chanceOfLauchExplosion<96)
            return true;
        else
            return false;
    }

    @Override
    public boolean land() {
        int chance= (int)(Math.random()*100)+1;
        float multi =(this.getCarriedWeight() / this.getMaxWeight());
        chanceofLandingCrash = chance; //* multi;
        if(chanceofLandingCrash<92)
            return true;
        else
            return false;
    }
}
