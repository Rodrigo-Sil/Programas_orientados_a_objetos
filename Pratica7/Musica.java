public class Musica{
    private String compositor;
    private int visualizacao;
    private String tipoMusica;
    private String titulo;
    private float valorMusica;
    
    public Musica() {
        setTipoMusica("Musica generica");
        setTitulo("Musica vazia");
        setCompositor("Compositor");
    }
    
    public Musica(String titulo, int visualizacao, String compositor) {
        setTitulo("Musica vazia");
        setTipoMusica("Musica generica");
        setVisualizacoes(visualizacao);
        setCompositor("Compositor");
    }
    
    public void setCompositor(String compositor) {
        if(compositor != null) {
            this.compositor = compositor;
        }
    }
    public String getCompositor () {
        return compositor;
    }
    public void setVisualizacoes(int visualizacao) {
        if(visualizacao > 0) {
            this.visualizacao = visualizacao;
        }
    }
    public int getVisualizacao() {
        return visualizacao;
    }
    public void setTipoMusica(String tipoMusica) {
        if (tipoMusica != null) {
            this.tipoMusica = tipoMusica;
        }
    }
    public String getTipoMusica() {
        return tipoMusica;
    }
    public void setTitulo(String titulo) {
        if(titulo != null) {
            this.titulo = titulo;
        }
    }
    public String getTitulo() {
        return titulo;
    }
    public void setValorMusica(float valorMusica) {
        if(valorMusica > 0) {
            this.valorMusica = valorMusica;
        }
    }
    public float getValorMusica() {
        return valorMusica;
    }
    
    public float calcularValorMusica() {
        return 0;
    }
    public String sucesso() {
        return "";
    }
    public String toString() {
        return String.format("Titulo: %s, tipo: %s, visualizacoes:%d, compositor: %s, valor: %.1f", getTitulo(), getTipoMusica(), getVisualizacao(), getCompositor(), getValorMusica());
    }

    public boolean valdarNome() {
        if  (getCompositor() == "Compositor" || getTitulo() == "Musica vazia") {
            return false;
        }
        
        return true;
    }
    
}


