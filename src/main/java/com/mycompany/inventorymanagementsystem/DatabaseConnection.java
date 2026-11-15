/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/retail_store_db";

    private static final String USER = "root";
    private static final String PASSWORD = "bm@light5";

    public static Connection getConnection() {

        try {
            Connection conn = DriverManager.getConnection(
                    URL, USER, PASSWORD
            );

            System.out.println("Connected to MySQL!");
            return conn;

        } catch (SQLException e) {

            System.out.println("Connection failed!");
            System.out.println(e.getMessage());

            return null;
        }
    }
}
