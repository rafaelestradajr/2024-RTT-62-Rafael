package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Product;

import java.util.List;
import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerDAO productDAO = new CustomerDAO();
        Scanner scanner = new Scanner(System.in);

        public void run() {
            // prompt the user to enter a product name
            String customerId = inputId();
// use our productDAO to run the query
            List<Customer> customers = customerDAOfindByrId();

            // print our product menu
            printCustomers(customers);

            // now validate that the user enters a proper product id
            Product selectedProduct = null;
            while( selectedProduct == null ) {
                // #2 print the list of products
                int id = promptForId();






        CustomerDAO customerDAO = new CustomerDAO();


        Customer newCustomer = new Customer();

        newCustomer.setCustomerName("Hello");
        newCustomer.setContactFirstName("Rafael");
        newCustomer.setContactLastName("Crazy");
        newCustomer.setId(100);
        newCustomer.setPhone("408555665");
        newCustomer.setAddressLine1("5256 redwiid ln");
        newCustomer.setAddressLine2("95899");
        newCustomer.setState("state");
        newCustomer.setPostalCode("95688");
        newCustomer.setCity("san antonio");
        newCustomer.setCreditLimit(5000.00);
        newCustomer.setCountry("USA");
        //newCustomer.setSalesRepEmployeeId();


        customerDAO.insert(newCustomer);

        List<Customer> customers = customerDAO.findByContactFirstName("Crazy");
        //List<Employee> employees = employeeDAO.findByLastName("Doe");

        for (Customer customer : customers) {
            System.out.println(customer);
        }




    }
}}}
