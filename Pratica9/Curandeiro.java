public class Curandeiro extends Lutador{
    public Curandeiro(){}

    public Curandeiro(String nome, String alcunha) {
        super(nome, alcunha);
    }

    public Curandeiro(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        setNome(nome);
        setAlcunha(alcunha);
        setForca(forca);
        setVelocidade(velocidade);
        setVida(vida);
        this.setCura(cura);
    }

    public void setCura(int cura) {
        if (cura > getVelocidade() && cura > getVida() && cura > getForca()) {
            super.setCura(cura);
        }
    }

    @Override
    public int poderDeAtaque() {
        int a = getCura() + getForca() * getVelocidade();
        return a;
    }

    @Override
    public int poderDeDefesa() {
        int d = getCura() + getCura() * getVida();
        return d;
    }
}
