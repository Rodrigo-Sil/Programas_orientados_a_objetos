public class Cubo extends SolidoGeometrico {
    private float lado;

    public Cubo(float lado) {
        setNome("Cubo");
        setLado(lado);
    }

    public Cubo() {
        setNome("Cubo");
    }

    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public float getLado() {
        if (lado != 0) {
            return lado;
        }
        return 0;
    }

    @Override
    public float calcularAreaTotal() {
        float areaLado = (float) Math.pow(lado, 2);
        return 6 * areaLado;
    }

    @Override
    public float calcularVolume() {
        float volume = (float) Math.pow(lado, 3);
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s (lado = %.2f)\nVolume: %.2f - Area Total: %.2f", getNome(), lado, calcularVolume(), calcularAreaTotal());
    }
}

