public class PacienteEndocrino {
    private String nome;
    private int idade;
    private float altura;
    private float peso;


    public PacienteEndocrino(String nome, int idade, float altura, float peso) {
   	this.nome = nome;
	this.idade = idade;
	this.altura = altura;
	this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade <= 120 ) {
            this.idade = idade;
        }
    }

    public void setAltura(float altura) {
        if (altura >= 1.30 && altura <= 2.50) {
            this.altura = altura;
        }
    }

    public void setPeso(float peso) {
        if (peso >= 40.0 && peso <= 300.0) {
            this.peso = peso;
        }
    }

    public float calcularIMC(){
        if (idade < 19) {
            float resultado = 0.0f;
            return resultado;
        } else {
            return peso/(altura*altura);
        }
    }

    public String classificarIMC() {
        if(calcularIMC() < 18.5) {
            return "Abaixo do Normal";
        } else if (calcularIMC() >= 18.5 && calcularIMC() <= 24.9) {
            return "Normal";
        } else if (calcularIMC() >= 25.0 && calcularIMC() <= 29.9) {
            return "Sobrepeso";
        } else if (calcularIMC() >= 30.0 && calcularIMC() <= 34.9) {
            return "Obesidade grau I";
        } else if (calcularIMC() >= 35.0 && calcularIMC() <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }


    public String gerarRelatorio() {
        if (nome != null && idade > 0&& altura > 0.0 && peso > 0.0) {
            String relatorio = String.format("%s, %d anos, %.2fm, %.1fkg\nIMC: %.6f (%s)", nome, idade, altura, peso, calcularIMC(), classificarIMC());
            return relatorio;
        } else {
            return "Entre com todos os dados do paciente!";
        }
    }

}
