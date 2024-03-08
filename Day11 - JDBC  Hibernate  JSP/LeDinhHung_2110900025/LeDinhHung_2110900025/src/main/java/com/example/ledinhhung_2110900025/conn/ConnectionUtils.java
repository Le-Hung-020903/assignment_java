package com.example.ledinhhung_2110900025.conn;

import com.example.ledinhhung_2110900025.beans.Book;
import com.example.ledinhhung_2110900025.utils.BookUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ConnectionUtils {
    public static Connection getMSSQLConnections() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://DESKTOP-MOTUJCG\\SQLSERVER:1433;databaseName=LEDinhHung_2110900025_Dbs;encrypt=false";
        String user = "sa";
        String password = "1412";

        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public static void closeQuietly(Connection conn) {
        try {
            conn.close();
        } catch (Exception e) {

        }
    }

    public static void rollbackQuietly(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = getMSSQLConnections();
        System.out.println("connection " + conn);
        List<Book> list = null;
        try {
            list = BookUtils.getAllBooks(conn);
        }catch (SQLException e){
            e.printStackTrace();

        }
        for (Book item: list
             ) {
            System.out.println("connection " + item.getBookId());
        }
        System.out.println("done");

    }
}
