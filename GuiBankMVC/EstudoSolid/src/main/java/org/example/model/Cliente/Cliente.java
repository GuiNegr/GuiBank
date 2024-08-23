package org.example.model.Cliente;

import org.example.model.AbstractPerson;
import org.example.model.Pessoa.Pessoa;

public class Cliente extends AbstractPerson implements ClienteReader,ClienteWritter {

    private Pessoa pessoa;
    private String id;
    private String idFkPessoa;
    private String numeroConta;
    private double saldo;



    @Override
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    @Override
    public String id() {
        return this.id;
    }

    @Override
    public String getidFKPessoa() {
        return this.idFkPessoa;
    }

    @Override
    public String numeroConta() {
        return this.numeroConta;
    }

    @Override
    public double saldo() {
        return this.saldo;
    }

    @Override
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setIdFkPessoa(String idFkPessoa) {
            this.idFkPessoa = idFkPessoa;
    }

    @Override
    public void setNumeroConta(String numeroConta) {
            this.numeroConta = numeroConta;
    }

    @Override
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
