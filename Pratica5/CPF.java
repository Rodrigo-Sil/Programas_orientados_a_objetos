public class CPF {
    private String nome;
    private String numero;
    private int diaEmissao;
    private int mesEmissao;
    private int anoEmissao;

    public CPF() {}

    public CPF(String numero) {
        setNumero(numero);
    }

    public void setNome(String nome) {
        if(validarNome(nome)) {
            this.nome = nome.toUpperCase();
        }
    }
    
    public boolean validarNome(String nome) {
        if(nome != null) {
            for(int i = 0; i < nome.length(); i++) {
                char c = nome.charAt(i);
                if(Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String getNome() {
            if(nome != null) {
                return nome;
            }
            return null;
    }
    
     public void setNumero(String numero) {
        if (validarNumero(numero)) {
            this.numero = numero;
        }
    }
    
    
    public boolean validarNumero(String numero) {
        int g, i, j, k, soma1 = 0, soma2 = 0, resto1, resto2;

        g = 10;
        
        if(numero.length() == 11) {
            for (i = 0; i < 9; i++) {
                soma1 += Character.getNumericValue(numero.charAt(i)) * g;
                g--;
            }

            resto1 = soma1 % 11;

            if (resto1 == 0 || resto1 == 1) {
                j = 0;
            }else {
                j = 11 - resto1;
            }

            g = 11; 

            for (i = 0; i < 10; i++) {
                soma2 += Character.getNumericValue(numero.charAt(i)) * g;
                g--;
            }
            
            resto2 = soma2 % 11;

            if (resto2 == 0 || resto2 == 1) {
                k = 0;
            }else {
                k = 11 - resto2;
            }
            
            if(Character.getNumericValue(numero.charAt(9)) == j && Character.getNumericValue(numero.charAt(10)) == k) {
                return true;
            }
            
        }

        return false;

    }

    public String getNumero() {
        return numero;
    }
    
    
    public void setEmissao(int diaEmissao, int mesEmissao, int anoEmissao) {
        if (numero != null) {
            if(anoEmissao > 1900 && anoEmissao <= 2025) {
                if(mesEmissao > 0 && mesEmissao <= 12) {
                    if (diaEmissao > 0 && diaEmissao <= 31) {
                        switch (mesEmissao) {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                if(diaEmissao > 0 && diaEmissao <= 31) {
                                     this.diaEmissao = diaEmissao;   
                                }
                                break;
                            case 2:
                                if(diaEmissao > 0 && diaEmissao <= 28) {
                                    this.diaEmissao = diaEmissao;
                                }
                                break;
                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                if (diaEmissao > 0 && diaEmissao <= 30) {
                                    this.diaEmissao = diaEmissao;
                                }
                                break;
                        }
                    }
                    this.mesEmissao = mesEmissao;
                }
                this.anoEmissao = anoEmissao;
            }
        }
    }
    
    public String getEmissao() {
        if (diaEmissao != 0 && mesEmissao != 0 && anoEmissao != 0) {
            return diaEmissao + "/" + mesEmissao + "/" + anoEmissao;
        }
        return "Para exibir a data de emissao, entre com data e numeracao validas!";
    }
}
