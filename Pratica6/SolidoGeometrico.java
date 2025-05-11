public class SolidoGeometrico {
    private String nome;

    public SolidoGeometrico(String nome) {
        setNome(nome);
    }

    public SolidoGeometrico() {
        setNome("Solido Generico");
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public float calcularAreaTotal() {
        return 0;
    }

    public float calcularVolume() {
        return 0;
    }

    public String toString() {
        return String.format("%s\nVolume: %.2f - Area Total: %.2f", nome, calcularVolume(), calcularAreaTotal());
    }

}
