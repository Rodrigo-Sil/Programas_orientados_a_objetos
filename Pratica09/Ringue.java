public class Ringue {
    private Lutador lutadorUm;
    private Lutador lutadorDois;

    public Ringue() {}

    public Ringue(Lutador lutadorUm, Lutador lutadorDois) {
        setLutadorUm(lutadorUm);
        setLutadorDois(lutadorDois);
    }

    public void setLutadorUm(Lutador lutadorUm) {
        if(lutadorUm != null) {
            this.lutadorUm = lutadorUm;
        }
    }

    public void setLutadorDois(Lutador lutadorDois) {
        if(lutadorDois != null) {
            this.lutadorDois = lutadorDois;
        }
    }

    public String apresentandoLutadores() {
        return String.format("De um lado o(a) %s o(a) incrivel %s\nVS\nE do outro %s o(a) espetacular %s\nQuem sera o(a) campeao", lutadorUm.getNome(), lutadorUm.getAlcunha(), lutadorDois.getNome(), lutadorDois.getAlcunha());
    }
    
    public String lutar() {

        int pontosL1 = 0;
        int pontosL2 = 0;
        String maiorAtaque = null;
        String maiorDefesa = null;

        if(lutadorUm.poderDeAtaque() > lutadorDois.poderDeAtaque()) {
            maiorAtaque = lutadorUm.getNome();
            pontosL1++;
        } else if(lutadorUm.poderDeAtaque() < lutadorDois.poderDeAtaque()){
            maiorAtaque = lutadorDois.getNome();
            pontosL2++;
        } else{
            maiorAtaque = "Empatados";
        }

        if(lutadorUm.poderDeDefesa() > lutadorDois.poderDeDefesa()){
            maiorDefesa = lutadorUm.getNome();
            pontosL1++;
        } else if(lutadorUm.poderDeDefesa() < lutadorDois.poderDeDefesa()){
            maiorDefesa = lutadorDois.getNome();
            pontosL2++;
        } else{
            maiorDefesa = "Empatados";
        }

        if(pontosL1 > pontosL2){
            return String.format("Maior poder de ataque: %s\nMaior poder de defesa: %s\nO resultado e: %s", maiorAtaque, maiorDefesa, lutadorUm.getNome());
        } else if(pontosL2 > pontosL1){
            return String.format("Maior poder de ataque: %s\nMaior poder de defesa: %s\nO resultado e: %s", maiorAtaque, maiorDefesa, lutadorDois.getNome());
        } else{
            return String.format("Maior poder de ataque: %s\nMaior poder de defesa: %s\nO resultado e: Empate", maiorAtaque, maiorDefesa);
        }
    }
}
