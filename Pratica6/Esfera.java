public class Esfera extends SolidoGeometrico {
    private float raio;

    public Esfera(float raio) {
        setNome("Esfera");
        setRaio(raio);
    }

    public Esfera() {
        setNome("Esfera");
    }

    public void setRaio(float raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public float getRaio() {
        if (raio != 0) {
            return raio;
        }
        return 0;
    }

    @Override
    public float calcularAreaTotal() {
        return 4 * (float) Math.PI * (float) Math.pow(raio, 2);
    }

    @Override
    public float calcularVolume() {
        return (4 * (float) Math.PI * (float) Math.pow(raio, 3))/3;
    }

    @Override
    public String toString() {
        return String.format("%s (raio = %.2f)\nVolume: %.2f - Area Total: %.2f", getNome(), getRaio(), calcularVolume(), calcularAreaTotal());
    }
}


