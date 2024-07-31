package Funções;

import Comunicador.Conecta;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CadPessoa {

    public static boolean door(User user) {
        if(VerificaRG.validarRg(user.getRg()) && VerificaCPF.verificaCPF(user.getCpf())){
            cadPessoa(user);
            return true;
        }
        return false;
    }

    private static void cadPessoa(User user){
        String sql = "insert into cadPessoa (nome,sobrenome,nascimento,saldoConta,cpf,rg) values  (?,?,?,?,?,?)";

        try {
            Connection connection = Conecta.conecta();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getNome());
            preparedStatement.setString(2,user.getSobrenome());
            preparedStatement.setDate(3,user.getNascimento());
            preparedStatement.setDouble(4,user.getSaldo());
            preparedStatement.setString(5,user.getCpf());
            preparedStatement.setString(6, user.getRg());
            preparedStatement.execute();
        }catch (Exception e){
            System.out.println("error cadPessoa"+e.getMessage());
        }
    }
}
