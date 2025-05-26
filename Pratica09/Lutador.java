public abstract class Lutador {
    private String nome;
    private String alcunha;
    private int forca;
    private int velocidade;
    private int vida;
    private int cura;

    public Lutador() {}

    public Lutador(String nome, String alcunha) {
        setNome(nome);
        setAlcunha(alcunha);
    }

    public Lutador(String nome, String alcunha, int forca, int velocidade, int vida) {
        this(nome, alcunha);
        setForca(forca);
        setVelocidade(velocidade);
        setVida(vida);
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setAlcunha(String alcunha) {
        if (alcunha != null) {
            this.alcunha = alcunha;
        }
    }

    public String getAlcunha() {
        return alcunha;
    }

    public void setForca(int forca) {
        if (forca > 0) {
            this.forca = forca;
        }
    }

    public int getForca() {
        return forca;
    }

    public void setVelocidade(int velocidade) {
        if(velocidade > 0) {
            this.velocidade = velocidade;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVida(int vida) {
        if (vida > 0) {
            this.vida = vida;
        }
    }

    public int getVida() {
        return vida;
    }

    public void setCura(int cura) {
        if (cura > 0) {
            this.cura = cura;
        }
    }

    public int getCura() {
        return cura;
    }

    public abstract int poderDeAtaque();

    public abstract int poderDeDefesa();
}