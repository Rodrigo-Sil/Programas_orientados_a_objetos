public class Tanque extends Lutador{
    public Tanque(){}

    public Tanque(String nome, String alcunha) {
        setNome(nome);
        setAlcunha(alcunha);
    }

    public Tanque(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        setNome(nome);
        setAlcunha(alcunha);
        setForca(forca);
        setVelocidade(velocidade);
        this.setVida(vida);
        setCura(cura);
    }

    public void setVida(int vida) {
        if (vida > getVelocidade() && vida > getForca() && vida > getCura()) {
            super.setVida(vida);
        }
    }

    @Override
    public int poderDeAtaque() {
        int a = getForca() * getVelocidade() + getVida();
        return a;
    }

    @Override
    public int poderDeDefesa() {
        int d = getCura() * getVida() + getVida();
        return d;
    }

}