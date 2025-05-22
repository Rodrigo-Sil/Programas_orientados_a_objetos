public class Robot {
    private int coordX;
    private int coordY;
    private String modelo;
    private float nivelBateria;

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        if(modelo != null){
            this.modelo = modelo;
        }
    }

    public float getNivelBateria() {
        return nivelBateria;
    }

    public String getLocalizacao() {
        return String.format("[%d, %d]", coordX, coordY);
    }

    public Robot(){
        this.coordX = 0;
        this.coordY = 0;
        this.nivelBateria = 100;
    }

    public void andarFrente(){
        this.coordX += 1;
        this.nivelBateria -= 0.5;
    }

    public void andarTraz(){
        this.coordX -= 1;
        this.nivelBateria -= 0.5;
    }

    public void andarCima(){
        this.coordY += 1;
        this.nivelBateria -= 0.5;
    }

    public void andarBaixo(){
        this.coordY -= 1;
        this.nivelBateria -= 0.5;
    }

    public void comer(Plasma comida){
        this.nivelBateria += comida.getEnergia();
        if(this.nivelBateria > 100){
            this.nivelBateria = 100;
        }
    }
}
