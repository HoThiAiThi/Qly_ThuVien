/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

/**
 *
 * @author thi
 */
public class JDBCConnection {
    public static Connection connectSQL(){
// Create datasource.
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("051202");
        ds.setServerName("LAPTOP-1SELQ3N7\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("QL_TAILIEU");
        ds.setEncrypt(false);
        ds.setTrustServerCertificate(false);
        try {
            System.err.println("GOOD");
            return ds.getConnection();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }   
}
