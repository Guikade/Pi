/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classespi;

import TelasPI.telaCadCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Guikade
 */
public class CadClien {
    private PI Conexao;
    private Connection conn;
    
    public CadClien(){
        this.Conexao= new PI();
        this.conn= this.Conexao.getconection();
    }
    
    public int CADASTRAR (InfoCliente inf){
            
        try{
            PreparedStatement stmt =  this.conn.prepareStatement("INSERT INTO cadastrocliente (nome, email, senha) VALUES (?,?,?)");
            stmt.setString(1, inf.getNome());
            stmt.setString(2, inf.getEmail());
            stmt.setString(3, inf.getSenha());
            
        }catch(SQLException ex){
            System.out.println("Erro  conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
        
        return 0;
    }
    public static void main(String[] args) throws SQLException {
         
    }
}
