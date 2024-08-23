package org.example.model.Cliente;
import org.example.model.Pessoa.Pessoa;


public interface ClienteWritter {

    public void setPessoa(Pessoa pessoa);
    public void setId(String id);
    public void setIdFkPessoa(String idFkPessoa);
    public void setNumeroConta(String numeroConta);
    public void setSaldo(Double saldo);

}
