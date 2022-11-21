package br.daniel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String USERNAME = "root";
    private static String PASSWORD = "root";
    private static String DATABASE_URL = "jdbc:mysql://localhost:3306/empresa?useTimezone=true&serverTimezone=UTC";

    public static Connection connectMySql() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        return conexao;
    }
}
