public class Geladeira {
    
    //atributos
    String marca;
    String cor;
    int voltagem;
    float temperaturaAtual;
    boolean portaAberta;
   
   //metodos
    void abrirPorta() {
        portaAberta = true;
        System.out.println("A porta foi aberta.");
    }
    
    void fecharPorta() {
        portaAberta = false;
        System.out.println("A porta foi fechada.");
    }
}

