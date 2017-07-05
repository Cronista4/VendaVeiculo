package vendaveiculo;

public class Cliente {

    int CPF, dependentes, dianasc, mesnasc, anonasc;
    double renda, desconto;
    String nome, rua, numero, bairro, cidade;
    Data datanasc;

    public Cliente(int CPF, double renda, int dependentes, int dianasc, int mesnasc,
            int anonasc, String nome, String rua, String numero, String bairro, String cidade) {
        this.CPF = CPF;
        this.renda = renda;
        this.dependentes = dependentes;
        this.datanasc = new Data(dianasc, mesnasc, anonasc, 0, 0, 0);
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public void setCpf(int cpf) {
        this.CPF = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(Data datanasc) {
        this.datanasc = datanasc;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public void setDep(int dependentes){
        this.dependentes = dependentes;
    }

    public double getRenda() {
        return renda;
    }

    public int getDependentes() {
        return dependentes;
    }

    public double getDesconto() {
        if (renda < 1000) {
            this.desconto = renda * 0.1;//10%
        } else {
            if (renda < 3000) {
                this.desconto = renda * 0.07;//7%

            } else {
                this.desconto = renda * 0.05;//5%
            }
        }

        return desconto;
    }

    public int getCpf() {
        return CPF;
    }
}
