package Model;

public class Conta {
    private String id;
    private String cpfFK;
    private String rgFk;
    private double saldoConta;
    private double limiteConta;
    private String senha;


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpfFK() {
        return cpfFK;
    }

    public void setCpfFK(String cpfFK) {
        this.cpfFK = cpfFK;
    }

    public String getRgFk() {
        return rgFk;
    }

    public void setRgFk(String rgFk) {
        this.rgFk = rgFk;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }
}
