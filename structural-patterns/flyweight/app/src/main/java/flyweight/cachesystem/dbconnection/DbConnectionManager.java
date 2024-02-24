package flyweight.cachesystem.dbconnection;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DbConnectionManager {

    private static DbConnectionManager dbConnectionManager;
    private final Connection connection;
    private final Dotenv dotenv = Dotenv.load();

    private DbConnectionManager() {
        try {
            Class.forName("org.postgresql.Driver");
            String url = this.dotenv.get("DB_URL");
            String username = this.dotenv.get("DB_USERNAME");
            String password = this.dotenv.get("DB_PASSWORD");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DbConnectionManager getInstance() {
        if (Objects.isNull(dbConnectionManager)) {
            dbConnectionManager = new DbConnectionManager();
        }
        return dbConnectionManager;
    }

    public Connection getConnection() {
        return connection;
    }

}
