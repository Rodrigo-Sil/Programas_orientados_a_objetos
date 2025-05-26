public class Destruidor extends Lutador{
    public Destruidor() {}

    public Destruidor(String nome, String alcunha) {
        setNome(nome);
        setAlcunha(alcunha);
    }

    public Destruidor(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        setNome(nome);
        setAlcunha(alcunha);
        this.setForca(forca);
        setVelocidade(velocidade);
        setVida(vida);
        setCura(cura);
    }

    public void setForca(int forca) {
        if (forca > getVelocidade() && forca > gettVida() && forca > getCura()) {
            super.setForca(forca);
        }
    }

    @Override
    public int poderDeAtaque() {
        int a = getForca() * getVelocidade() + getForca();
        return a;
    }

    @Override
    public int poderDeDefesa() {
        int d = getCura() * getVida() + getForca();
        return d;
    }

}