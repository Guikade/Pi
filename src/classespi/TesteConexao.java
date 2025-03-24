
package classespi;


public class TesteConexao {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver carregado com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Driver do MySQL não encontrado!");
            e.printStackTrace();
        }
    }
}

