-- 1.Problem Statement One:
-- Write a query to display each customer’s name (as “Customer Name”), along with the name of the employee who is responsible for that customer’s orders. The employee name should be in a single “Sales Rep” column, formatted as “lastName, firstName.” The output should be sorted alphabetically by customer name.


-- SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
select c.customer_name as 'Customer Name', concat(e.lastname, ', ', e.firstname) as 'Sales Rep'
from customers c JOIN employees e
                      on c.sales_rep_employee_id = e.id
order by c.customer_name asc;


-- 2. Problem Statement two:
-- To determine which products are the most popular with our customers.
-- For each product, list the total quantity ordered, along with the total sale
-- generated (total quantity ordered * priceEach) for that product.
-- The column headers should be “Product Name,” “Total # Ordered,” and “Total Sale.”
-- List the products by “Total Sale” descending.

select p.product_name as 'Product Name', sum(od.quantity_ordered) as 'Total # Ordered', sum(od.quantity_ordered * od.price_each) as 'Total Sale'
from products p LEFT JOIN orderdetails od
                          on p.id=od.id
group by p.product_name, p.buy_price
order by 3 desc;


-- 3. Problem Statement three:
-- Write a query that lists order status and the number of orders with that status. Column headers should be “Order Status” and “Total Orders.” Sort alphabetically by status.


select status as 'Order Status', count(status) as 'Total Orders'
from orders
group by status
order by status;



-- 4. Problem Statement four:
-- Write a query to list, for each product line, the total number of products sold
-- from that product line. The first column should be “Product Line” and the second
-- should be “total Sold.” Order by the second column, descending.


SELECT product_line as 'Product_line',

       quantity_ordered as 'Total Sold'
from orderdetails, productlines;


-- 5.Problem Statement five:
-- Your product team is requesting data to help them create a bar chart of monthly
 --   sales made since the company’s inception. Write a query to output
 --  the month (January, February, etc.), 4-digit year, and total sales for each month.
  --  The first column should be labeled ‘Month,’ the second column should be labeled
  --  ‘Year,’ and the third column should be labeled ‘Payments Received.’ Values in the
   -- third column should be formatted as numbers with two decimals

select
    monthname(payment_date) AS Month,
    year(payment_date) AS Year,
    format(sum(amount), 2) AS 'Payments Received'
from payments
group by year(payment_date), monthname(payment_date)
order by payment_date;

-- 6.Problem statement five:
-- Write a query to display the Name, Product Line, Scale, and Vendor of all of the Car products — both classic and vintage. The output should display all vintage cars first (sorted alphabetically by name), and all classic cars last (also sorted alphabetically by name).

SELECT p.product_name Name, p.productline_id AS `Product Line`, p.product_scale AS `Scale`,
       p.product_vendor AS `Vendor`
FROM productlines l NATURAL JOIN products p
WHERE l.product_line = "Classic Cars" OR l.product_line = "Vintage Cars"
ORDER BY p.productline_id DESC, p.product_name ASC;

