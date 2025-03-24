/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classespi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CadProd {
    
    private PI Conexao;
    private Connection conn;
    
    public CadProd() {
        this.Conexao = new PI();
        this.conn = this.Conexao.getConnection();
    
    }
    public int CADASTRAR(InfoProduto inf){
        
    
    String sql = "INSERT INTO cadastroproduto (produto, valor) VALUES (?, ?)";
    
     try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
         
            stmt.setString(1, inf.getNome());
            stmt.setString(2, Double.toString(inf.getValor()));
            
            int rowsInserted = stmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("Cadastro realizado com sucesso!");
            }
            
            return 0;
     }
     
     catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            ex.printStackTrace();
            return ex.getErrorCode();
        } finally {
            Conexao.fecharConexao(); // Fecha a conexão após uso
        }
        
    }
    
    
    public static void main(String[] args) {
   
    }
}