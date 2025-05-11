public class Piramide extends SolidoGeometrico {
    private float lado;
    private float altura;

    public Piramide(float lado, float altura){
        setNome("Piramide");
        setLado(lado);
        setAltura(altura);
    }

    public Piramide() {
        setNome("Piramide");
    }

    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public float getLado() {
        if (lado != 0.0) {
            return lado;
        } else {
            return 0;
        }
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public float getAltura() {
        if (altura != 0.0) {
            return altura;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String s = String.format("Piramide (lado = %.2f, altura = %.2f)\nVolume: %.2f - Area Total: %.2f", getLado(), getAltura(), calcularVolume(), calcularAreaTotal());
        return s;
    }

    @Override
    public float calcularAreaTotal() {
        float ab = lado*lado;
        float h = (float)(Math.sqrt(altura*altura + (lado*lado)/4));
        float al = 4*((lado*h)/2);
        return ab + al;
    }

    @Override
    public float calcularVolume() {
        float areaBase = lado * lado;
        float volume = (areaBase * altura) / 3;
        return volume;
    }
}

