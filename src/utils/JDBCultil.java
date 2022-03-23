package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCultil {

    public static Connection criarConexao() {

        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "lucas864713";

        Connection conexao = null;

        try {

            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão Efetuada com sucesso.");

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Conexao com o banco de dados falhou");

        }
        return conexao;
    }
}