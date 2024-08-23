package org.example.model.Pessoa;

public interface PessoaReader {

    public String getId();
    public String getNome();
    public String getCpf();
    public String getRg();
    public String getDataNascimento();
    public Tipo getTipo();
}
