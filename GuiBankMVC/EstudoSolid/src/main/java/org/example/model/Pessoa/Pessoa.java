package org.example.model.Pessoa;

import org.example.model.AbstractPerson;

public class Pessoa extends AbstractPerson implements PessoaWriter, PessoaReader {

    private String id;
    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private Tipo tipo;

    public Pessoa(String nome, String cpf, String rg, String dataNascimento, Tipo tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.tipo = tipo;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String getRg() {
        return this.rg;
    }

    @Override
    public String getDataNascimento() {
        return this.dataNascimento;
    }

    @Override
    public Tipo getTipo() {
        return this.tipo;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
