package Model;

public class User {
    private String nome;
    private String sobrenome;
    private double Saldo;
    private String cpf;
    private String rg;
    private String numConta;
    private String agencia;





    public User(String nome, String sobrenome, double saldo, String cpf, String rg, String numConta, String agencia) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        Saldo = saldo;
        this.cpf = cpf;
        this.rg = rg;
        this.numConta = numConta;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
