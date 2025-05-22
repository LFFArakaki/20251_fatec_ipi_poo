package br.marilu;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String host = "localhost";
    private String port = "5432";
    private String db = "20251_fatec_ipi_poo_pessoas_MariLu";
    private String user = "postgres";
    private String password = "123456";

    public Connection obterConexao() throws Exception {
        String s = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, db
        );
        Connection c = DriverManager.getConnection(s, user, password);

        return c;
    }
}
