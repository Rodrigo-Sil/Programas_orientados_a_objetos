public class Cobra {
    private String nome;
    private int pontosDeEscalada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public int getPontosDeEscalada() {
        return pontosDeEscalada;
    }

    public void setPontosDeEscalada(int pontosDeEscalada) {
        if (pontosDeEscalada >= 0) {
            this.pontosDeEscalada = pontosDeEscalada;
        }
    }

    public Cobra(String nome, int pontosDeEscalada) {
        setNome(nome);
        setPontosDeEscalada(pontosDeEscalada);
    }

    public Cobra() {}

    public void comer (Comida comida) {
        pontosDeEscalada += comida.getEnergia();
    }

    public String toString() {
        if (pontosDeEscalada <= 0) {
            return String.format("Eu era a cobra %s, estou morta!", nome);
        } else {
            return String.format("Sou a cobra %s, tenho %d de energia!", nome, pontosDeEscalada);
        }
    }
}

