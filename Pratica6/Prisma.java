public class Prisma extends SolidoGeometrico {
    private float lado1;
    private float lado2;
    private float lado3;
    private float altura;

    public Prisma(float lado1, float lado2, float lado3, float altura) {
        setNome("Prisma");
        setLados(lado1, lado2, lado3);
        setAltura(altura);
    }

    public Prisma() {
        setNome("Prisma");
    }

    public void setLados(float lado1, float lado2, float lado3) {
        if((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)){
            if(lado1 > 0){
                this.lado1 = lado1;
            } if(lado2 > 0){
                this.lado2 = lado2;
            } if(lado3 > 0){
                this.lado3 = lado3;
            }
        }
    }

    public float getLado1() {
        if (lado1 != 0) {
            return lado1;
        }
        return 0;
    }

    public float getLado2() {
        if (lado2 != 0) {
            return lado2;
        }
        return 0;
    }

    public float getLado3() {
        if (lado3 != 0) {
            return lado3;
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
    public float calcularAreaTotal() {
        float s = (lado1 + lado2 + lado3)/2;
        float aBase = (float) Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        float aLateral = (lado1 + lado2 + lado3) * altura;
        return 2 * aBase + aLateral;
    }

    @Override
    public float calcularVolume() {
        float s = (lado1 + lado2 + lado3)/2;
        float aBase = (float) Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return aBase * altura;
    }

    @Override
    public String toString() {
        return String.format("%s (lado1 = %.2f, lado2 = %.2f, lado3 = %.2f, altura = %.2f)\nVolume: %.2f - Area Total: %.2f", getNome(), getLado1(), getLado2(), getLado3(), getAltura(), calcularVolume(), calcularAreaTotal());
    }
}
