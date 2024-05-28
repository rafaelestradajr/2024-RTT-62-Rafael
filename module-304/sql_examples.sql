select lastname, firstname  from employees;

select e.* ,o.city;

select count(*) as 'count'
from offices o
where o.country = 'USA';

-- I want to see all employees that work in an office in the USA
select * from employees;
select * from offices;
select e.*, o.city
from employees e, offices o
where e.office_id = o.id
	and o.country = 'USA';
    
    
    -- lets start looking at what is in the various tables
    select * from orders;
    select * from orderdetails;
    
    -- cacluate the total priced for each line tiem in the order 10103
    
    select od.*, (quantity_ordered * price_each) as total_price,  p.product_name
    from orderdetails od, products p, orders o
    where order_id = 10103
		and p.id = od.product_id
        and o.id = od.order_id
	order by order_line_number;
    
    select od.*, (quantity_ordered * price_each),p.product_name
    from orderdetails od, products p,orders o
    where order_id =10103
      and p.id = od.product_id
     order by order_line_number;


-- now lets add the day of the order
select * from orders where id = 10103; -- this only returns a single record

select od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date
from orderdetails od, products p, orders o
where order_id = 10103
	and p.id = od.product_id
    and o.id = od.order_id
order by order_line_number;

-- now lets add the customers name to this report

select od.*, (quantity_ordered * price_each) as total_price, p.product_name, o.order_date, c.customer_name
from orderdetails od, products p, orders o
where order_id = 10103
	and p.id = od.product_id
    and o.id = od.order_id
order by order_line_number;
select * from employees;

-- so this is a new question--
-- I want to see the sum of the total cost for all line items for order 10103
-- the sum() function is call an aggregate 
select  sum(quantity_ordered * price_each) as total_order_cost,
  max(quantity_ordered) as max_quantity_ordered,
  min(quantity_ordered) as min_quantity_ordered,
  avg(quantity_ordered * price_each) as average_line_item_cost,
  avg(quantity_ordered) as avg_quantity_ordered
from orderdetails od
where order_id = 10103;







select  sum(quantity_ordered * price_each) as total_price
from orderdetails od
where order_id = 10103;


-- I want to see the total order cost for all orders


select  * from orderdetails;
select order_id, sum(quantity_ordered * price_each) as total_order_cost,
  min(quantity_ordered) as min_qty_ordered,
  count(*) as number_of_products
from orderdetails
group by order_id;


-- now I want to see the total amount each customer has spent
-- step 1 was to join the customer table and the order table
-- we also limited our colums in the result set so the data was a bit more consumable by human brain
-- put an order by on this so we could see all of the customer order together


-- step 2 we need to continue joining over to the order details table
-- we added a second column to the order by so we could see the products in each order by the order id
select c.customer_name, c.id as order_id, od.product_id
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
order by customer_name, order_id;

-- step 3
select c.customer_name, c.id as order_id, od.product_id, quantity_ordered, price_each, (quantity_ordered * price_each) as line_item_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
order by customer_name, order_id;


-- step 4 is add the group by
-- we removed the extra columns that were not in group by from the select
-- also removed the extracolumns from the order by
-- because we are grouping but the customer id we can also get the customer name because the customer record is singula and grouped by
select c.customer_name, c.id as order_id, od.product_id, quantity_ordered, price_each, (quantity_ordered * price_each) as line_item_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
  group by c.id
order by total_customer_spend desc;

-- to expand the oringal question to see the sum of each order for each customer
-- we have now added an order by for the order id so we can see the total cos for each ordre for all customrer
-- we can now include the order id in the select columns because it is in the group by
select c.customer_name, c.id as order_id, od.product_id, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
group by c.id, o.id
order by c.customer_name;

-- now lets make this one more step complex.  I only want to see the order that over 50k
-- by adding having it allows us to filter the aggregate results and we can not do this in the where clause because the
-- aggregate result has not yet been calculated at the time the database is considering the where clause

select c.customer_name, c.id,  o.id as order_id, sum(quantity_ordered * price_each) as total_order_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
  and o.id = od.order_id
group by c.id, o.id
having total_order_cost > 50000
order by c.customer_name;


