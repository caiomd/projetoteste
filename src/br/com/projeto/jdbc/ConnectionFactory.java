package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://localhost/projeto_java", "root", "");

        } catch (SQLException erro) {
             throw new RuntimeException(erro);

        }
    }
}
