public class PacienteOftalmo {
	private String nome;
	private int idade;
	private float acuidadeOlhoDireito;
	private float acuidadeOlhoEsquerdo;

	public PacienteOftalmo(String nome, int idade, float acuidadeOlhoDireito, float acuidadeOlhoEsquerdo) {
		this.nome = nome;
		this.idade = idade;
		this.acuidadeOlhoDireito = acuidadeOlhoDireito;
		this.acuidadeOlhoEsquerdo = acuidadeOlhoEsquerdo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null) {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0 && idade <= 120) {
			this.idade = idade;
		}
	}

	public float getAcuidadeOlhoDireito() {
		return acuidadeOlhoDireito;
	}

	public void setAcuidadeOlhoDireito(float acuidadeOlhoDireito) {
		if(acuidadeOlhoDireito >= 0.0 && acuidadeOlhoDireito <= 1.0) {
			this.acuidadeOlhoDireito = acuidadeOlhoDireito;
		}
	}

	public float getAcuidadeOlhoEsquerdo() {
		return acuidadeOlhoEsquerdo;
	}

	public void setAcuidadeOlhoEsquerdo(float acuidadeOlhoEsquerdo) {
		if(acuidadeOlhoEsquerdo >= 0.0 && acuidadeOlhoEsquerdo <= 1.0) {
			this.acuidadeOlhoEsquerdo = acuidadeOlhoEsquerdo;
		}
	}


	public float calcularMediaAcuidade() {
		return (acuidadeOlhoDireito + acuidadeOlhoEsquerdo) / 2;
	}

	public String classificacao() {

	        if (calcularMediaAcuidade() >= 0.9){
        	    return "Excelente";
	        } else if (calcularMediaAcuidade() >= 0.7 && calcularMediaAcuidade() < 0.9){
        	    return "Boa";
	        } else if (calcularMediaAcuidade() >= 0.5 && calcularMediaAcuidade() < 0.7){
        	    return "Moderada";
	        } else if (calcularMediaAcuidade() >= 0.3 && calcularMediaAcuidade() < 0.5){
        	    return "Ruim";
	        } else if (calcularMediaAcuidade() < 0.3){
	            return "Muito Ruim";
	        } else {
        	    return "Nao se aplica";
	        }
	}


	 public String gerarRelatorio() {

         if (nome != null && idade != 0 && acuidadeOlhoDireito != 0.0 && acuidadeOlhoEsquerdo != 0.0 && calcularMediaAcuidade() != 0.0){
            String relatorio = String.format("%s, %d anos\nAcuidade Visual (OE): %.2f\nAcuidade Visual (OD): %.2f\nMedia da Acuidade Visual: %.2f\nClassificacao: %s", nome, idade, acuidadeOlhoEsquerdo, acuidadeOlhoDireito, calcularMediaAcuidade(), classificacao());
            return relatorio;
        } else {
            return "Entre com todos os dados do paciente!";
        }
    }

}
