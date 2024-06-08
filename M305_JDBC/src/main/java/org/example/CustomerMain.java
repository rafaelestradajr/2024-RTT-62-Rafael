package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.OrderDAO;
import org.example.database.entity.OrderDetail;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerMain {

    private Scanner scanner =new Scanner(System.in);
    private CustomerDAO customerDAO = new CustomerDAO();
    private OrderDAO orderDAO = new OrderDAO();
    Integer customerId = promptForCustomerId();

    private Integer promptForCustomerId() {
        while (true){
            try{
                System.out.println("Please enter the customer ID");
                int id = scanner.nextInt();
                return id;
            }catch (InputMismatchException e) {
                System.out.println("Id not on file, please try again");
            }
            scanner.nextLine();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "root25";
        System.out.println("-------- MySQL CustomerMain------------");


        //scanner here to take input from the user to search for a specific first name for example
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first name of the employee you want to search for: ");
        String input = scanner.nextLine();
        int input2 = scanner.nextInt();




        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);
//            String selectSQL = "Select * FROM employees where firstname = '" + input + "' ";
            String selectSQL = "Select * FROM employees where firstname = ? or lastname = ? or id = ? ";
//            Statement stmt = connection.createStatement();

            PreparedStatement stmt = connection.prepareStatement(selectSQL);

            stmt.setString(1, input);
            stmt.setString(2, "Doe");
            stmt.setInt(3, input2);


            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                String employeeID = result.getString("id");
                String fname = result.getString("firstname");
                String lname = result.getString("lastname");
                String email = result.getString("email");
                String jobTitle = result.getString("job_title");
               System.out.println(employeeID +" | " + fname + " | "+ lname + " | " + email + " | " + jobTitle );
                String format = "%-10s | %-15s | %-15s | %-35s | %-20s%n";
// Use printf to format the output
                System.out.printf(format, employeeID, fname, lname, email, jobTitle);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}