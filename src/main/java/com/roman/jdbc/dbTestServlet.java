package com.roman.jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;


@WebServlet("/dbTestServlet")
public class dbTestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Locale.setDefault(Locale.ENGLISH);
        Connection connection;
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "lolkis", "12345123");

            PrintWriter writer = response.getWriter();

            writer.println("SUCCESS");
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
