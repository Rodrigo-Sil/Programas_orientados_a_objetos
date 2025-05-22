public class PlasmaSombrio extends Plasma {
    public PlasmaSombrio(int energia){
        super();
        setEnergia(energia);
    }

    public int getEnergia() {
        int energiaPlasma = super.getEnergia();
        return energiaPlasma;
    }

    public void setEnergia(int energia) {
        if (energia > 0) {
            energia *= -1;
        }
        if(energia >= -10 && energia <= -1){
            super.setEnergia(energia);
        } else{
            super.setEnergia(0);
        }
    }
}
