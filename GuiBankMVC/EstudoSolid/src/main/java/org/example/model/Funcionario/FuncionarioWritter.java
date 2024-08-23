package org.example.model.Funcionario;

import org.example.model.Pessoa.Pessoa;

public interface FuncionarioWritter {

    public void setPessoa(Pessoa pessoa);
    public void setId(String id);
    public void setIdFkPessoa(String idFkPessoa);
    public void setSalario(double salario);
}
