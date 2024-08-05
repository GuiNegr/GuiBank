package Funções;

import Comunicador.Conecta;
import Model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadPessoa {

    public static boolean door(Pessoa pessoa) {
        if (VerificaRG.validarRg(pessoa.getRg()) && VerificaCPF.verificaCPF(pessoa.getCpf())) {
            cadPessoa(pessoa);
            return true;
        }
        return false;
    }


    private static void cadPessoa(Pessoa pessoa) {
       String sql = "insert into pessoa (nome,dataNascimento,cpf,rg) values  (?,?,?,?)";

   try {
            Connection connection = Conecta.conecta();
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1,pessoa.getNome());
           preparedStatement.setDate(2,pessoa.getNascimento());
            preparedStatement.setString(3,pessoa.getCpf());
            preparedStatement.setString(4, pessoa.getRg());
            preparedStatement.execute();
        }catch (Exception e){
           System.out.println("error cadPessoa"+e.getMessage());
        }
    }
    }

