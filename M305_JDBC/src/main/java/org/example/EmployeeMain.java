package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Employee;

import java.util.List;

//import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        //CustomerDAO customerDAO = new CustomerDAO();

//        // lets create a new employee in the database
        Employee newEmployee = new Employee();

        newEmployee.setFirstname("First NAME!!!");
        newEmployee.setLastname("Lastname");
        newEmployee.setEmail("Eduardo@perschols.org");
        newEmployee.setOfficeId(3);
        newEmployee.setExtension("X12345");
        newEmployee.setJobTitle("Newbie");
        newEmployee.setVacationHours(0);

        employeeDAO.insert(newEmployee);

        List<Employee> employees = employeeDAO.findByFirstName("First NAME!!!");
//     List<Employee> employees = employeeDAO.findByLastName("Doe");

        for (Employee employee : employees) {
            System.out.println(employee);
            //System.out.println(employee);

        }
    }
}