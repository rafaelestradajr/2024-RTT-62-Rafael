package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.OrderDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

    private Scanner scanner = new Scanner(System.in);
    private CustomerDAO customersDAO = new CustomerDAO();
    private OrderDAO ordersDAO = new OrderDAO();
    Integer customerId = promptForCustomerId();


    public int promptForCustomerId() {

        while (true) {
            try {
                System.out.println("Please enter the customer ID: ");
                int id = scanner.nextInt();
                return id;
            } catch (InputMismatchException e) {
                System.out.println("Id not on file, please try again-");
                scanner.nextLine();
            }
        }
    }

    public void printOrders(List<Order> Orders) {


        System.out.println("For the customer ID of- " + customerId + " the following orders are placed:\n" + "Order Id  |  Order Date  |  Shipped Date");
        System.out.println("=========================================");
        //print out the results of the query
        for (Order order : Orders) {
            System.out.println(order.getId() + " | " + order.getOrderDate() + " | " + order.getShippedDate());
        }
    }

    public int promptForOrderId() {

        while (true) {
            try {
                System.out.println("Now, please enter an Order ID so that we can update the comment: ");
                int id = scanner.nextInt();
                return id;
            } catch (InputMismatchException e) {
                System.out.println("Id not on file, please try again-");
                scanner.nextLine();
            }
        }
    }



    public void run() {
        // prompt the user to enter a customerId

        // use our customerDAO to run the query
        List<Order> customers = ordersDAO.findByCustomerId(customerId);

        printOrders(customers);
        //print our orders
//        printOrders();
//
//        //now validate that the user enters a property product id
//        Orders orderId = null;
//        while (orderId == null ) {
//            // 2. print the list of products
//            int newOrderId = promptForOrderId();
//
//
//            // 2.5 - what happens if the user enters a bad id number that doesn't exist
//            // we have 2 types of problems here:
//            // 1. the user enters a non-numeric value
//            // 2.the user enters a numeric id tha doesn't exist in the database
//            orderId = ordersDAO.findById(newOrderId);
//            if (orderId == null) {
//                System.out.println("You have entered an invalid product id");
//            }
//        }
//
//
//        //3
//        int quantity = promptQuantityInStock();
//        System.out.println(quantity);
//
//        // 4.
//        updateQuantityInStock(selectedProduct, quantity);
//
//        //5.
//        System.out.println(selectedProduct);

    }

    public static void main(String[] args) {

        CustomerMain cm = new CustomerMain();
        cm.run();


    }
}