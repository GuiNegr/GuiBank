package Comunicador;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {

    public static Connection conecta(){
        Connection conecta = null;
        try {
            String url = "jdbc:mysql://localhost:3306/GuiBank?user=root&password=root";
            conecta = DriverManager.getConnection(url);
            System.out.println("Conexão bem sucidida!");
            return conecta;
        }catch (SQLException e){
            System.out.println("ERRO DE CONEXÃO: "+e.getMessage());
            return null;
        }
    }

}
