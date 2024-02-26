package proxy.bankaccountcachesystem.dao;

import proxy.bankaccountcachesystem.dbconnection.DbConnectionManager;
import proxy.bankaccountcachesystem.model.BankAccount;
import proxy.bankaccountcachesystem.model.impl.BankAccountImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccountDao {
    private final Connection connection;

    public BankAccountDao() {
        this.connection = DbConnectionManager.getInstance().getConnection();
    }

    public BankAccountImpl findById(Integer id) {
        String sql = "SELECT id, account_number, balance FROM accounts WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new BankAccountImpl(
                            resultSet.getInt("id"),
                            resultSet.getString("account_number"),
                            resultSet.getDouble("balance")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
