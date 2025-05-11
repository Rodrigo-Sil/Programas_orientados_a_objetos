public class Cilindro extends SolidoGeometrico {
    private float raio;
    private float altura;

    public Cilindro(float raio, float altura) {
        setNome("Cilindro");
        setRaio(raio);
        setAltura(altura);
    }

    public Cilindro() {
        setNome("Cilindro");
    }

    public void setRaio(float raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public float getRaio() {
        return raio;
    }

    public float getAltura() {
        return altura;
    }

    public String toString() {
        String resultado = String.format("Cilindro (raio = %.2f)\nVolume: %.2f - Area Total: %.2f", getRaio(), calcularVolume(), calcularAreaTotal());
        return resultado;
    }

    @Override
    public float calcularVolume() {
        float pi = (float) Math.PI;
        float volume = pi * (raio * raio) * altura;
        return volume;
    }

    @Override
    public float calcularAreaTotal() {
        float pi = (float) Math.PI;
        float area = 2 * pi * raio * (raio + altura);
        return area;
    }

}

