public class Main {
    public static void main(String[] args) {
        Geladeira g1;
        g1 = new Geladeira();
        g1.marca = "Brastemp";
        g1.cor = "Inox";
        g1.voltagem = 220;
        g1.temperaturaAtual = 7.4f;
        g1.portaAberta = true;
        
        System.out.println(g1.marca + ", " + g1.cor + ", " + g1.voltagem + ", " + g1.temperaturaAtual + ", " + g1.portaAberta);
    }
}
