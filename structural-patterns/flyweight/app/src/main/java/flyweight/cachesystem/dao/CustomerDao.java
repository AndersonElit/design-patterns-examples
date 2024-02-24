package flyweight.cachesystem.dao;

import flyweight.cachesystem.dbconnection.DbConnectionManager;
import flyweight.cachesystem.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {
    private final Connection connection;

    public CustomerDao() {
        this.connection = DbConnectionManager.getInstance().getConnection();
    }

    public Customer findById(Integer id) {
        String sql = "SELECT id, name, email, phone FROM customer WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Customer(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("email"),
                            resultSet.getString("phone")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
