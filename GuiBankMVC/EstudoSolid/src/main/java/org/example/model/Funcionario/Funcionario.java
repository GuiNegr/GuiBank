package org.example.model.Funcionario;

import org.example.model.AbstractPerson;
import org.example.model.Pessoa.Pessoa;
import org.example.model.Pessoa.Tipo;

public class Funcionario extends AbstractPerson implements FuncionarioReader, FuncionarioWritter{

        private Pessoa pessoa;
       private String id;
       private String idFKPessoa;
       private double salario;

    @Override
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String idFKPessoa() {
        return this.idFKPessoa;
    }

    @Override
    public double getSalario() {
        return this.salario;
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
            this.idFKPessoa = idFkPessoa;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
