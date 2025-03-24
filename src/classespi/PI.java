package classespi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PI {

    private Connection conn;
    private final String url = "jdbc:mysql://localhost:3306/pidb"; 
    private final String user = "root"; 
    private final String password = "filhotes8"; 


    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do MySQL não encontrado!");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
        return this.conn;
    }

    public void fecharConexao() {
        if (this.conn != null) {
            try {
                this.conn.close();
                System.out.println("Conexão fechada.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            } finally {
                this.conn = null;
            }
        }
    }
}
