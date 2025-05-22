public class Plasma {
    private int energia;

    public Plasma(){
        super();
    }

    public Plasma(int energia){
        setEnergia(energia);
    }

    public int getEnergia() {
        int energiaPlasma = energia;
        setEnergia(0);
        return energiaPlasma;
    }

    public void setEnergia(int energia) {
        if((energia >= 1 && energia <= 10) || (energia >= -10 && energia <= -1)){
            this.energia = energia;
        } else{
            this.energia = 0;
        }
    }
}
