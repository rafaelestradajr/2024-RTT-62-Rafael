package org.example;

import java.sql.*;
import java.util.Scanner;


public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "root25";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);


            Scanner  scanner = new Scanner(System.in);
            System.out.println("Enter the first name of the employee you want to search for:");
            String input = scanner.nextLine();

            String SelectSQL = "Select * FROM employees where firstname = ?  or lastname = ?";

            //Statement stmt = connection.createStatement();
            PreparedStatement stmt =connection.prepareStatement(SelectSQL);
            stmt.setString(1,input);
            stmt.setString(2,"Doe");



            ResultSet result =  stmt.executeQuery();

            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                String email  = result.getString("email");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname + "|" + email );

            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

