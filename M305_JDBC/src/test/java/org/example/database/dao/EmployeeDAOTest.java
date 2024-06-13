package org.example.database.dao;

import org.example.database.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;




public class EmployeeDAOTest {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @ParameterizedTest
    @CsvSource(
            {
                    "Leslie",
                    "Tom",
            }
    )
    public void findByFirstNameTest(String firstName) {

        List<Employee> employees = employeeDAO.findByFirstName(firstName);
        Assertions.assertTrue(employees.size() > 0);
        for (Employee e : employees) {
            Assertions.assertEquals(firstName, e.getFirstname());

        }
    }







    @Test
    public void findByIdTest() {
        // given
        Integer userid = 1216;

        // when
        Employee employee = employeeDAO.findById(userid);

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
        Employee employee = employeeDAO.findById(userid);

        // then
        Assertions.assertNull(employee);
    }






@Test
    public void createNewEmployee() {
        // given
        Employee given = new Employee();

        given.setLastname("Garza");
        given.setFirstname("Eduardo");
        given.setEmail("eduardo2584@gmail.com");
        given.setExtension("x2564");
        given.setReportsTo(6666);
        given.setVacationHours(40);
        given.setProfileImageUrl("2342342344");
        given.setDepartmentId(null);
        given.setJobTitle("Owner");
        given.setOfficeId(2);


        // when
        employeeDAO.insert(given);

        // then
        Employee actual = employeeDAO.findById(given.getId());

        Assertions.assertEquals(given.getFirstname(), actual.getFirstname());
        Assertions.assertEquals(given.getLastname(), actual.getLastname());

    }

    }







