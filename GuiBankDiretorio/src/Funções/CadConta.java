package Funções;

import Comunicador.Conecta;
import Model.Conta;
import Model.Pessoa;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadConta {


    public static boolean CriarConta(Pessoa pessoa){
        String sql = "SELECT * FROM PESSOA WHERE CPF = ?";

        try{
            Connection connection = Conecta.conecta();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pessoa.getCpf());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String cpf = resultSet.getString("cpf");
                if(cpf != null){
                    Conta conta = returnConta();
                    conta.setCpfFK(pessoa.getCpf());
                    inserirConta(conta);
                    return true;
                }
            }
            return false;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }


    private static void inserirConta(Conta conta){
        String sql = "insert into conta (cpfFk,senha,SaldoConta,LimiteConta,id) values (?,?,?,?,?)";

        try{
            Connection conect = Conecta.conecta();
            PreparedStatement preparedStatement = conect.prepareStatement(sql);
            preparedStatement.setString(1,conta.getCpfFK());
            preparedStatement.setString(2,conta.getSenha());
            preparedStatement.setDouble(3,conta.getSaldoConta());
            preparedStatement.setDouble(4,conta.getLimiteConta());
            preparedStatement.setString(5,conta.getId());
            preparedStatement.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static Conta returnConta(){
        boolean continuar = true;
        Conta conta = new Conta();
        do{
            String senha = JOptionPane.showInputDialog("POR FAVOR INFORME A SENHA");
            String senha2 = JOptionPane.showInputDialog("POR FAVOR NOVAMENTE A SENHA");
            JOptionPane.showMessageDialog(null,"SENHAS NÃO SE CONDIZEM, REPITA O PROCESSO");
            if(senha2.equals(senha)){
                conta.setSenha(senha);
                continuar = false;
            }
        }while (continuar);
        Object[] options = {"SIM", "NÃO"};
        int opc = JOptionPane.showOptionDialog(null, "O CLIENTE POSSUI SALDO NA CONTA?", "AVISO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if(opc == 0){
            String saldo = JOptionPane.showInputDialog("INFORME O SALDO DA CONTA SEM O R$");
            Double saldoDb = Double.parseDouble(saldo);
            conta.setSaldoConta(saldoDb);
        }else if (opc == 1){
            conta.setSaldoConta(0);
        }
        String limite = JOptionPane.showInputDialog("INFORME O LIMITE DA CONTA SEM O R$");
        Double limiteDb = Double.parseDouble(limite);
        conta.setLimiteConta(limiteDb);
        String id = JOptionPane.showInputDialog("INFORME QUAL VAI SER O  ID DA CONTA");
        if(!temEsseID(id)){
            conta.setId(id);
        }
        return conta;
    }

    private static boolean temEsseID(String id){
        String sql = "SELECT * FROM CONTA WHERE ID = ?";
        try {
            Connection connection = Conecta.conecta();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return false;
            }
            return false;
        }catch (Exception e){
            return true;
        }
    }
}
