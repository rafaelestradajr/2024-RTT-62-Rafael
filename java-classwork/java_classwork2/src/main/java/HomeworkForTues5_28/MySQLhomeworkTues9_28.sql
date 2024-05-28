-- Homework 1
-- Question 0.1

-- I want to see the count of the number of products in each product line

select * from productlines;
select * from products where productline_id = 1;

select pl.product_line, count(*)
from products p, productlines pl
where p.productline_id = pl.id
group by pl.id;

-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name
select * from employees;
select * from customers;

select e.id as employee_id, e.firstname, e.lastname, c.customer_name, c.contact_firstname, c.contact_lastname
from employees e, customers c
where c.sales_rep_employee_id = e.id
order by e.id;
-- question 0.3
-- I want to see a list of employees in each office.   Show the office name and the employee name

select * from offices;
select * from employees;

select o.city, e.firstname, e.lastname
from offices o, employees e
where o.id = e.office_id
order by o.city;

-- question 0.4
-- I want to see the total number of each employee type based on job title.. result should the job title and the number of employess with that job title.
select * from employees;
select job_title, count(*) from employees group by job_title order by job_title;

-- question 0.5
-- I want to see a list of all payments each customer has made.  Order the list by custoemr name ascending, then by the payment amount descending

select * from payments;
select * from customers;

select c.customer_name, p.amount
from customers c, payments p
where p.customer_id = c.id
order by c.customer_name asc, p.amount desc;


-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
select * from products where id not in ( select distinct product_id from orderdetails );

-- question 0.7
-- are there any customers that have never made an order
select * from orders;
select * from customers where id not in ( select customer_id from orders );



-- Question 1
-- How many customer are handled by each office.  I want to see the office name and the count of the number of customers in that office.



select * from offices;
select o.id, o.city, e.firstname, c.customer_name
from offices o, employees e, customers c
where o.id = e.office_id
  and e.id = c.sales_rep_employee_id
order by o.city, e.firstname;
select o.id, o.city, count(*)
from offices o, employees e, customers c
where o.id = e.office_id
  and e.id = c.sales_rep_employee_id
group by o.id
order by o.city;

-- Question 2
-- I want to see the products with the most margin at the top of the table.  Include the product name, buy price, msrp, and margin in the results.  Margin is calculated (MSPR - buy_price)

select * from products;

select product_name, buy_price, msrp, (msrp - buy_price) as margin
from products
order by margin desc;

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

select * from orders;

select * from orders where year(order_date) = 2004;



-- Question 6
-- I want to see the total amount of all orders grouped by the year

select * from orders;
select * from orderdetails;

select year(o.order_date), sum(od.quantity_ordered * price_each) as total_amount, count(distinct o.id) as order_count
from orders o, orderdetails od
where o.id = od.order_id
group by year(o.order_date);



-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders

select * from orderdetails;
select * from orders;

-- this was added by Eleanne as an additional requirement to not include orders where the status is Cancelled.
select product_name, sum(quantity_ordered) as total_ordered
from products p, orderdetails od
where od.product_id = p.id
  and od.order_id not in ( select id from orders where status = 'Cancelled' )
group by od.product_id
order by total_ordered desc
limit 5;

-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.

select p.id, p.product_name, count(p.id) as cnt
from orderdetails od, products p
where od.product_id = p.id
group by p.id
order by cnt desc;


-- question 7.6
-- how many products would be out of stock based on the amount sold acrosss time.
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock
-- To determine how many products are out of stock -- based on the quantity sold over time, you can use the SUM() function to calculate the total quantity sold
-- for each product and then compare it with the quantity in stock.

select quantity_in_stock from products;
select * from orderdetails;
select product_id, p.product_name, sum(quantity_ordered) as total_ordered, p.quantity_in_stock - sum(quantity_ordered) as overordered
from orderdetails od, products p
where p.id = od.product_id
group by product_id
having overordered < 0;

-- question 7.9
-- I want to see the distinct order status ordered alphabetically
select distinct status from orders order by status asc;


-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.

select * from productlines;
select distinct ofc.city, pl.product_line
from offices ofc, employees e, customers c, orders o, orderdetails od, products p, productlines pl
where ofc.id = e.office_id
  and c.sales_rep_employee_id = e.id
  and o.customer_id = c.id
  and od.order_id = o.id
  and od.product_id = p.id
  and p.productline_id = pl.id;






