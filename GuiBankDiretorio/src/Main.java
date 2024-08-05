import Funções.CadConta;
import Funções.CadPessoa;
import Funções.VerificaCPF;
import Funções.VerificaRG;
import Model.Pessoa;
import java.util.*;
import  java.sql.Date;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf(VerificaCPF.arrayToString("723.444.240-59"));
        if(CadConta.CriarConta(pessoa)){
        }
    }
}