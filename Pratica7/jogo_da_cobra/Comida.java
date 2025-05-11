public class Comida {
    private String nome;
    private int energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
    }

    public int getEnergia() {
        int energiaComida = energia;
        setEnergia(0);
        return energiaComida;
    }

    public void setEnergia(int energia) {
        if(energia >= 0){
            this.energia = energia;
        }
    }

    public Comida(){
        super();
    }

    public Comida(String nome, int energia){
        setNome(nome);
        setEnergia(energia);
    }
}
