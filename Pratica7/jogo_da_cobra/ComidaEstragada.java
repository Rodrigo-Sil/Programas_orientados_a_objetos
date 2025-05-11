class ComidaEstragada extends Comida{
    private int energia;


    public int getEnergia() {
        int energiaComida = energia;
        setEnergia(0);
        return energiaComida;
    }

    public void setEnergia(int energia) {
        if(energia <= 0){
            this.energia = energia;
        } else{
            energia *= (-1);
            this.energia = energia;
        }
    }

    public ComidaEstragada(){
        super();
    }

    public ComidaEstragada(String nome, int energia){
        setNome(nome);
        setEnergia(energia);
    }
}

