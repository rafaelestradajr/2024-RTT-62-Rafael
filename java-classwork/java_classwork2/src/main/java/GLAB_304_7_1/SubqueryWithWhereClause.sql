/*A) Let’s utilize the IN or NOT IN operator*/

SELECT employee_id, first_name, last_name, department_id
FROM employees
WHERE department_id IN (SELECT department_id
                        FROM departments
                        WHERE location_id = 1700)
ORDER BY first_name, last_name;

/*2) The following example uses a subquery with the NOT IN operator to find all
employees' information who do not locate at location 1700.*/

SELECT employee_id, first_name, last_name
FROM employees
WHERE department_id NOT IN (SELECT department_id
                            FROM departments
                            WHERE location_id = 1700)
ORDER BY first_name , last_name;

/*B) Let's utilize the comparison operator (=, >, =, <= , !=)
1. The following example finds the employees who have the highest salary:*/


SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees)
ORDER BY first_name, last_name;

/*2. The following query finds the employee number, name, and salary for the
employees whose salary is higher than the average salary throughout the
company:*/

SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary)FROM employees);

/*C) Let's utilize the EXISTS or NOT EXISTS operators.
The EXISTS operator checks for the existence of rows returned from the subquery.
It returns true if the subquery contains any rows. Otherwise, it returns false*/

SELECT department_name
FROM departments d
WHERE EXISTS ( SELECT * FROM employees e
               WHERE salary > 10000 AND e.department_id =
                                        d.department_id)
ORDER BY department_name;

/*2) Similarly, the following query finds all departments that do not have an
employee with a salary greater than 10,000, We will use the Where
clause, and the NOT EXISTS operator.*/

SELECT department_name
FROM departments d
WHERE NOT EXISTS ( SELECT * FROM employees e
WHERE salary > 10000 AND e.department_id = d.department_id) ORDER BY department_name;
