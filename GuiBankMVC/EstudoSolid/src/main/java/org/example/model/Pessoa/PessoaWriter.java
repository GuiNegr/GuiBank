package org.example.model.Pessoa;

public interface PessoaWriter {

    public void setId(String id);
    public void setNome(String nome);
    public void setCpf(String cpf);
    public void setRg(String rg);
    public void setDataNascimento(String dataNascimento);
    public void setTipo(Tipo tipo);
}
