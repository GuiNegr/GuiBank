package org.example.model.Funcionario;

import org.example.model.Pessoa.Pessoa;

public interface FuncionarioReader {

    public Pessoa getPessoa();
    public String getId();
    public String idFKPessoa();
    public double getSalario();

}
