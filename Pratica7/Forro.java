public class Forro extends Musica{
    public Forro() {
        setTipoMusica("Forro");
    }
    
    public Forro(String titulo, int visualizacao, String compositor) {
        setTitulo(titulo);
        setTipoMusica("Forro");
        setVisualizacoes(visualizacao);
        setCompositor(compositor);
        setValorMusica(calcularValorMusica());
    }
    
    public String sucesso() {
        if (!valdarNome()) {
            return "Sem sucesso definido";
        }
        if (getVisualizacao() <= 0) {
            return "Sem sucesso";
        } else if(getVisualizacao() >= 1 && getVisualizacao() <= 15000) {
            return "Pouco sucesso";
        } else if(getVisualizacao() > 15000 && getVisualizacao() <= 70000) {
            return "Sucesso medio";
        } else if(getVisualizacao() > 70000 && getVisualizacao() <= 400000) {
            return "Grande sucesso";
        }else {
            return "Musica hit";
        } 
    }
    public float calcularValorMusica() {
        int calculo = getVisualizacao();
        float resultado;
        
        if (!valdarNome()) {
            return 0;
        }
        
        if (getVisualizacao() <= 0) {
            return calculo * 0f;
        } else if(getVisualizacao() >= 1 && getVisualizacao() <= 15000) {
            resultado = calculo * 0.1f;
            setValorMusica(resultado);
            return resultado;
        } else if(getVisualizacao() > 15000 && getVisualizacao() <= 70000) {
            resultado = calculo * 0.5f;
            setValorMusica(resultado);
            return resultado;
        } else if(getVisualizacao() > 70000 && getVisualizacao() < 400001) {
            resultado = calculo * 0.7f;
            setValorMusica(resultado);
            return resultado;
        }else {
            resultado = calculo * 0.9f;
            setValorMusica(resultado);
            return resultado;
        }
    }
    
    public String toString() {
        if (getTipoMusica() != "Musica generica") {
            return String.format("%s, %s, %d, %s, %.1f", getTipoMusica(), getTitulo(), getVisualizacao(), getCompositor(), calcularValorMusica());
        }else {
            return String.format("%s, %s, %d, %s, %.1f", getTitulo(), getTipoMusica(), getVisualizacao(), getCompositor(), calcularValorMusica());
        }
    }
}
