package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class EmployeeDAOTest {

    private EmployeeDAO employeeDao = new EmployeeDAO();

    @BeforeAll
    public static void beforeAll() {
        // one use is to prepare or to clean up data in the database either before or after all your test cases run,
        // we could write some code to delete any customer from the database that has the "Test Customer" as the name

        // another example of something we could here in the before All,
        // if we were doing and old school JDBC connection we could create the actual database connection here
        // so that all the methods in this test case already have a database connection they could use
        // then in an @AfterAll you can close the database connection and release the resources
    }

    @Test
    public void findByIdTest() {
        // given
        Integer userid = 1216;

        // when
        Employee employee = employeeDao.findById(userid);

        // then
        // the expected value, meaning the value you are expecting it to be is the first argument
        // the actual value, meaning the value returned or modified by the test function is the 2nd argument
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(userid, employee.getId());
        Assertions.assertEquals("Patterson", employee.getLastname());
        Assertions.assertEquals("Steve", employee.getFirstname());
        Assertions.assertEquals("spatterson@classicmodelcars.com", employee.getEmail());
    }

    @Test
    public void findByInvalidIdTest() {
        // given
        Integer userid = 103033;

        // when
        Employee employee = employeeDao.findById(userid);

        // then
        Assertions.assertNull(employee);
    }





@Test
    public void createNewEmployee() {
        // given
        Employee given = new Employee();

        given.setLastname("Garza");
        given.setFirstname("Eduardo");
        given.setEmail("eduardo484@gmail.com");
        given.setExtension("x2564");
        given.setReportsTo(6666);
        given.setVacationHours(40);
        given.setProfileImageUrl("2342342344");
        given.setDepartmentId(null);
        given.setJobTitle("Owner");
        given.setOfficeId(2);


        // when
        employeeDao.insert(given);

        // then
        Employee actual = employeeDao.findById(given.getId());

        Assertions.assertEquals(given.getFirstname(), actual.getFirstname());
        Assertions.assertEquals(given.getLastname(), actual.getLastname());

    }




    }


