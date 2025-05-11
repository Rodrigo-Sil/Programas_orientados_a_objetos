public class Paralelepipedo extends SolidoGeometrico {
    private float largura;
    private float comprimento;
    private float altura;

    public Paralelepipedo() {
        setNome("Paralelepipedo");
    }

    public Paralelepipedo(float comprimento,  float altura, float largura) {
        setNome("Paralelepipedo");
        setComprimento(comprimento);
        setLargura(largura);
        setAltura(altura);
    }

    public void setLargura(float largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public float getLargura() {
        if (largura != 0) {
            return largura;
        }
        return 0;
    }

    public void setComprimento(float comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        }
    }

    public float getComprimento() {
        if (comprimento != 0) {
            return comprimento;
        }
        return 0;
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public float getAltura() {
        if (altura != 0) {
            return altura;
        }
        return 0;
    }

    @Override
    public float calcularVolume() {
        return altura * largura * comprimento;
    }

    @Override
    public float calcularAreaTotal() {
        return 2 * (altura * comprimento + altura * largura + comprimento * largura);
    }

    public String toString() {
        return String.format("Paralelepipedo (comprimento = %.2f, altura = %.2f, largura = %.2f)\nVolume: %.2f - Area Total: %.2f", comprimento, altura, largura, calcularVolume(), calcularAreaTotal());
    }
}

