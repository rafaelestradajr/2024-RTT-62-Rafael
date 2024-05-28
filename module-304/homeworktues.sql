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
SELECT state, customer_name as name,(msrp - buy_price)margin 
from `classic_models`.`customers`,`orderdetails`,`orders`,`products`




     
