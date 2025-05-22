public class Sertanejo extends Musica{
    
    public Sertanejo() {
        setTipoMusica("Sertanejo");
    }
    
    public Sertanejo(String titulo, int visualizacao, String compositor) {
        setTitulo(titulo);
        setTipoMusica("Sertanejo");
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
        } else if(getVisualizacao() >= 1 && getVisualizacao() <= 20000) {
            return "Pouco sucesso";
        } else if(getVisualizacao() > 20000 && getVisualizacao() <= 100000) {
            return "Sucesso medio";
        } else if(getVisualizacao() > 100000 && getVisualizacao() <= 500000) {
            return "Grande sucesso";
        }else {
            return "Musica hit";
        }
    }
    @Override
    public float calcularValorMusica() {
        int calculo = getVisualizacao();
        float resultado;
        
        if (!valdarNome()) {
            return 0;
        }
        
        if (getVisualizacao() <= 0) {
            return calculo * 0f;
        } else if(getVisualizacao() >= 1 && getVisualizacao() <= 20000) {
            resultado = calculo * 0.3f;
            setValorMusica(resultado);
            return resultado;
        } else if(getVisualizacao() > 20000 && getVisualizacao() <= 100000) {
            resultado = calculo * 0.8f;
            setValorMusica(resultado);
            return resultado;
        } else if(getVisualizacao() > 100000 && getVisualizacao() <= 500000) {
            resultado = calculo * 0.9f;
            setValorMusica(resultado);
            return resultado;
        }else {
            resultado = calculo * 1.0f;
            setValorMusica(resultado);
            return resultado;
        }
    }
    
    public String toString() {
        if (getTipoMusica() != "Musica generica") {
            return String.format("%s,%s, %d, %s, %.1f", getTipoMusica(), getTitulo(), getVisualizacao(), getCompositor(), calcularValorMusica());
        }else {
            return String.format("%s,%s, %d, %s, %.1f", getTitulo(), getTipoMusica(), getVisualizacao(), getCompositor(), calcularValorMusica());
        }
    }
}

