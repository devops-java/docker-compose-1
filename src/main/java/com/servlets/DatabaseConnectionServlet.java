package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.getWriter().write("connection: "+getConnection());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            resp.getWriter().write("not able to connect with mysql");
        }
    }

    private Connection getConnection() throws SQLException
    {
      Connection con = null;
      String url="jdbc:mysql://localhost:3306/my_demo_db?createDatabaseIfNotExist=true";
      String userName = "root";
      String password = "test_pass";
      con = DriverManager.getConnection(url,userName,password);
      return con;
    }

}
