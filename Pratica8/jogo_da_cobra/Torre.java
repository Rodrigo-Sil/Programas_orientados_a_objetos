public class Torre{
    String nivelDeDificuldade;
    int andares;

    public Torre(){}

    public Torre(int andares, String nivelDeDificuldade){
        setAndares(andares);
        setNivelDeDificuldade(nivelDeDificuldade);
    }

    public void setNivelDeDificuldade(String nivelDeDificuldade){
        if(nivelDeDificuldade == "facil" || nivelDeDificuldade == "medio" || nivelDeDificuldade == "dificil"){
            this.nivelDeDificuldade = nivelDeDificuldade;
        }
    }

    public String getNivelDeDificuldade(){
        if(nivelDeDificuldade != null){
            return nivelDeDificuldade;
        }else{
            return null;
        }
    }


    public void setAndares(int andares){
        if(andares > 0){
            this.andares = andares;
        }
    }

    public int getAndares(){
        return andares;
    }

    public String cobraConsegueEscalar(Cobra cobra){
        if(nivelDeDificuldade != null){
            int c = cobra.getPontosDeEscalada();
            if(nivelDeDificuldade == "facil"){
                while(c > 0 && andares > 0){
                    c--;
                    andares -= 2;
                }
                if(c >= andares){
                    return String.format("%s consegue escalar", cobra.getNome());
                }else{
                    return String.format("%s nao consegue escalar", cobra.getNome());
                }
            }else if(nivelDeDificuldade == "medio"){
                while(c > 0 && andares > 0){
                    c--;
                    andares--;
                }
                if(c >= andares){
                    return String.format("%s consegue escalar", cobra.getNome());
                }else{
                    return String.format("%s nao consegue escalar", cobra.getNome());
                }
            }else{
                while(c > 0 && andares > 0){
                    c -= 3;
                    andares--;
                }
                if(c >= andares){
                    return String.format("%s consegue escalar", cobra.getNome());
                }else{
                    return String.format("%s nao consegue escalar", cobra.getNome());
                }
            }
        }
        else{
            return "Nivel nao definido";
        }
    }
}
