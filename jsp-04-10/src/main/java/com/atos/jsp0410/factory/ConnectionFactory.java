package com.atos.jsp0410.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String USERNAME = "um9vlxqug1jom1hf";
    private static String PASSWORD = "dZKXe7P0r5uHPN0QqqlO";
    private static String DATABASE_URL = "jdbc:mysql://b7hlhdcg9mkxk3lyokgh-mysql.services.clever-cloud.com:3306/b7hlhdcg9mkxk3lyokgh?useTimezone=true&serverTimezone=UTC";
    private static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection connectMySql() throws Exception {
        Class.forName(DB_DRIVER);
        Connection conexao = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        return conexao;
    }
}
