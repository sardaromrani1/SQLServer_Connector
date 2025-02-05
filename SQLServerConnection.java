
// Source code is decompiled from a .class file using FernFlower decompiler.
//import java.sql.*;
import java.sql.Statement; // Correct import for java.sql.Statement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLServerConnection {
    public SQLServerConnection() {
    }

    public static void main(String[] var0) {
        String var1 = "DESKTOP-M079PML\\SQLEXPRESS01";
        String var2 = "db_TEST2";
        String var3 = "sardar";
        String var4 = "123456";
        String var5 = "jdbc:sqlserver://" + var1 + ";databaseName=" + var2
                + ";encrypt=true;trustServerCertificate=true;";
        Connection var6 = null;

        try {
            var6 = DriverManager.getConnection(var5, var3, var4);
            if (var6 != null) {
                System.out.println("Successfully connected to SQL Server database!");
                // Add code here to interact with the database
                // Example: Inserting data using PreparedStatement
                String insertSql = "INSERT INTO Customers(FirstName, City) VALUES(?, ?)";
                try (PreparedStatement preparedStatement = var6.prepareStatement(insertSql)) {
                    // Try-with-resources
                    preparedStatement.setString(1, "Alice Johnson");
                    preparedStatement.setString(2, "Chicago");
                    int rowsInserted = preparedStatement.executeUpdate();
                    System.out.println(rowsInserted + " row(s) inserted.");
                }

                // Example: Retrieving data using Statement and ResultSet
                String selectSql = "SELECT CustomerID, FirstName, City FROM Customers";
                try (Statement statement = var6.createStatement();
                        ResultSet resultSet = statement.executeQuery(selectSql)) {
                    // Try-with-resources
                    while (resultSet.next()) {
                        int customerID = resultSet.getInt("CustomerID");
                        String firstName = resultSet.getString("FirstName");
                        String city = resultSet.getString("City");
                        System.out
                                .println("CustomerID: " + customerID + ", FirstName: " + firstName + ", City: " + city);

                    }
                }
                // **Example: Updating data using PreparedStatement**
                String updateSql = "UPDATE Customers SET City = ? WHERE CustomerID = ?";
                try (PreparedStatement preparedStatement = var6.prepareStatement(updateSql)) {
                    preparedStatement.setString(1, "New York"); // New City
                    preparedStatement.setInt(2, 1); // CustomerID to update int
                    rowsUpdated = preparedStatement.executeUpdate();
                    System.out.println(rowsUpdated + " row(s) updated.");
                }
                // **Example: Deleting data using PreparedStatement**
                String deleteSql = "DELETE FROM Customers WHERE CustomerID = ?";
                try (PreparedStatement preparedStatement = var6.prepareStatement(deleteSql)) {
                    preparedStatement.setInt(1, 2); // CustomerID to delete int
                    rowsDeleted = preparedStatement.executeUpdate();
                    System.out.println(rowsDeleted + " row(s) deleted.");
                }
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException var16) {
            System.err.println("Error connecting to database: " + var16.getMessage());
        } finally {
            if (var6 != null) {
                try {
                    var6.close();
                    System.out.println("Connection closed.");
                } catch (SQLException var15) {
                    System.err.println("Error closing connection: " + var15.getMessage());
                }
            }

        }

    }
}
