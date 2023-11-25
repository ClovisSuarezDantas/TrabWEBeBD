package Conecta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TESTE {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:1309/TrabWEBeBD";
        String usuario = "postgres";
        String senha = "cloclo123";

        try {
            // Carrega o driver JDBC
            Class.forName("org.postgresql.Driver");

            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Se chegou até aqui, a conexão foi bem-sucedida
            System.out.println("Conexão bem-sucedida!");

            // Feche a conexão
            conexao.close();
        } catch (ClassNotFoundException e) {
            // Driver JDBC não encontrado
            System.err.println("Driver JDBC não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            // Erro ao estabelecer a conexão
            System.err.println("Erro ao estabelecer a conexão com o banco de dados.");
            e.printStackTrace();
        }
    }
}