package org.example;
import org.example.database.dao.OrderDAO;
import org.example.database.entity.Order;
import java.util.Date;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {

            OrderDAO orderDAO = new OrderDAO();
            //CustomerDAO customerDAO = new CustomerDAO();

//        // lets create a new employee in the database
            Order newOrder = new Order();

            newOrder.setId(5);
            newOrder.setCustomerId(123);
            newOrder.setOrderDate(new Date());
            newOrder.setRequiredDate(new Date());
            newOrder.setShippedDate(new Date());
            newOrder.setStatus("Shipped");
            newOrder.setComments("completed");

            orderDAO.insert(newOrder);

            List<Order> orders = orderDAO.findByCustomerId("123");
//     List<Order> orders = employeeDAO.findByLastName("Doe");

        //System.out.println(employee);
        for (Order order : orders) {
            System.out.println(order);
        }
}}
