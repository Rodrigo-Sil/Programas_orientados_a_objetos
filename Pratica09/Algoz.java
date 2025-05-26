public class Algoz extends Lutador{
    public Algoz(){}

    public Algoz(String nome, String alcunha) {
        setNome(nome);
        setAlcunha(alcunha);
    }

    public Algoz(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        setNome(nome);
        setAlcunha(alcunha);
        setForca(forca);
        this.setVelocidade(velocidade);
        setVida(vida);
        setCura(cura);
    }

    public void setVelocidade(int velocidade) {
        if (velocidade > getCura() && velocidade > getVida() && velocidade > getForca()) {
            super.setVelocidade(velocidade);
        }
    }

    @Override
    public int poderDeAtaque() {
        int a = getForca() * getVelocidade() + getVelocidade();
        return a;
    }

    @Override
    public int poderDeDefesa() {
        int d = getCura() * getVida() + getVelocidade();
        return d;
    }
}