/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classespi;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author gui
 */
public class PI {

    /**
     * @param args the command line arguments
     */
    public Connection conn;
    public String url = "jdbc:mysql://localhost:3306/pidb"; //Nome da base de dados
    public String user = "root"; //nome do usuário do MySQL
    public String password = "filhotes8"; //senha do MySQL
    
    
     public Connection getconection(){
    
     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pidb", "root", "filhotes8");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco " + ex.getMessage() );
            return null;
        }
       
}
      public void Connection (){
        try {
            conn.close();
        } catch (SQLException ex) {
            //posso deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }
}