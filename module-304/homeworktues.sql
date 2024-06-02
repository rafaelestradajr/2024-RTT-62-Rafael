-- Homework 1
-- Question 0.1

-- I want to see the count of the number of products in each product line

select product_line, count(*) as  product_count
from productlines
group by product_line;

-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name
select
    firstname AS employee_first_name,
    lastname AS employee_last_name,
    contact_firstname AS customer_contact_first_name,
    contact_lastname AS customer_contact_last_name,
    customer_name
    from  `classic_models`.`customers`, `employees`;
    
    -- question 0.3
-- I want to see a list of employees in each office.   Show the office name and the employee name

select
office_id AS office_name,
firstname AS employee_first_name,
lastname AS employee_last_name
 from  `classic_models`. `employees`;
 
 -- question 0.4
-- I want to see the total number of each employee type based on job title.. result should the job title and the number of employess with that job title.
SELECT job_title, COUNT(*) AS number_of_employees
FROM employees
GROUP BY job_title
ORDER BY job_title ASC;


-- question 0.5
-- I want to see a list of all payments each customer has made.  Order the list by custoemr name ascending, then by the payment amount descending

   select  customer_name, check_number, payment_date, amount
   from `classic_models`.`customers`, `payments` 
   order by customer_name asc, amount desc;

    
-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
select * from products where id not in ( select product_id from orderdetails ); 


-- question 0.7
-- are there any customers that have never made an order
SELECT c.customer_name, c.id as customer_id
from customers c
left join orders o on c.id = o.id
where o.id is null;
 
 
 -- Question 1
-- How many customer are handled by each office.  I want to see the office name and the count of the number of customers in that office.



SELECT o.id as office_name, COUNT(c.id) AS customer_count
FROM offices o
LEFT JOIN customers c ON o.id = c.id
GROUP BY o.id;


-- Question 2
-- I want to see the products with the most margin at the top of the table.  Include the product name, buy price, msrp, and margin in the results.  Margin is calculated (MSPR - buy_price) 

SELECT 
    product_name, 
    buy_price, 
    msrp, 
    (msrp - buy_price) AS margin
FROM 
    products
ORDER BY 
    margin DESC;
    
    -- Question 2.5
-- I want to see the top 5 customers in each state based on margin 

SELECT 
        state,
        customer_name,
        (msrp - buy_price) as margin,
         ROW_NUMBER() OVER (PARTITION BY state ORDER BY (msrp - buy_price)  DESC) AS ranking
    FROM 
        customers,products;
        
        -- Question 3
--  I want to see the top 5 salesmen in the company based on the total amount sold

SELECT sales_rep_employee_id,customer_name,sum(amount) as total_sales
FROM customers, orders, payments
group by sales_rep_employee_id, customer_name, amount;


-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)

select sales_rep_employee_id, sum(amount) as sales
 from
customers, orders, payments
group by sales_rep_employee_id, amount;



-- Question 5 
-- I want to see all of the orders that happened in 2004.   You can use a function called year(order_date) = 2004
SELECT *
FROM Orders
WHERE YEAR(order_date) = 2004;



-- Question 6
-- I want to see the total amount of all orders grouped by the year



-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders



-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.



-- question 7.6
-- how many products would be out of stock based on the amount sold acrosss time.  
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock
-- To determine how many products are out of stock -- based on the quantity sold over time, you can use the SUM() function to calculate the total quantity sold
-- for each product and then compare it with the quantity in stock. 

SELECT p.id as product_id, product_name
FROM products p
JOIN orderdetails  ON product_id = product_id
GROUP BY p.id, product_name, quantity_in_stock
HAVING SUM(quantity_ordered) > quantity_in_stock;

-- question 7.9
-- I want to see the distinct order status ordered alphabetically



-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.  

SELECT 
    o.office_name,
    p.product_line
FROM 
    Offices o
JOIN 
    Sales s ON o.office_id = s.office_id
JOIN 
    Products p ON s.product_id = p.product_id
GROUP BY 
    o.office_name, p.product_line;






     
