SELECT AVG(salary) average_salary
FROM employees GROUP BY department_id;

SELECT ROUND( AVG(average_salary), 0)
FROM ( SELECT AVG(salary) as average_salary FROM employees GROUP BY
    department_id) department_salary;

/*Example 2:
The following query gets the top five products by sales revenue in 2003 from the
orders and orderdetails tables*/

SELECT productCode, ROUND(SUM(quantityOrdered * priceEach)) AS sales
FROM orderdetails
         INNER JOIN orders USING (orderNumber)
WHERE YEAR(shippedDate) = 2003
GROUP BY productCode
ORDER BY sales DESC
LIMIT 5;

SELECT productName, sales
FROM (SELECT productCode, ROUND(SUM(quantityOrdered * priceEach)) AS sales
      FROM orderdetails INNER JOIN orders USING (orderNumber)
      WHERE YEAR(shippedDate) = 2003
      GROUP BY productCode
      ORDER BY sales DESC
      LIMIT 5) as top5products2003
         INNER JOIN products USING (productCode);
