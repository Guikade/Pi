package classespi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadClien {
    private PI Conexao;
    private Connection conn;
    
    public CadClien() {
        this.Conexao = new PI();
        this.conn = this.Conexao.getConnection();
    }
    
    public int CADASTRAR(InfoCliente inf) {
        if (this.conn == null) {
            System.out.println("Erro: conexão não foi estabelecida.");
            return -1; 
        }

        String sql = "INSERT INTO cadastrocliente (nome, email, senha) VALUES (?, ?, ?)";
        
        try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
            stmt.setString(1, inf.getNome());
            stmt.setString(2, inf.getEmail());
            stmt.setString(3, inf.getSenha());
            
            
            int rowsInserted = stmt.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("Cadastro realizado com sucesso!");
            }
            
            return 0;

        } catch (SQLException ex) {
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
