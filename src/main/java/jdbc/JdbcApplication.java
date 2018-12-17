package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;

public class JdbcApplication {

    public static void main(String[] args) throws SQLException {
        Locale.setDefault(Locale.ENGLISH);

        OracleDriverManager driverManager = new OracleDriverManager();
        Connection connection = driverManager.openOracleConnection();

        SimpleExample simpleExample = new SimpleExample(connection);
        simpleExample.insertExample();
        simpleExample.selectExample();
    }
}