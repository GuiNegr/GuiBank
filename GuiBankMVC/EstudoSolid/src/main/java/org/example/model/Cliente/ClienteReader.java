package org.example.model.Cliente;
import org.example.model.Pessoa.Pessoa;

public interface ClienteReader {

    public Pessoa getPessoa();
    public String id();
    public String getidFKPessoa();
    public String numeroConta();
    public double saldo();
}
