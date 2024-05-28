SELECT product_id,ROUND( AVG(quantity_ordered * price_each)) as avg_order_value
FROM orderdetails
GROUP BY product_id;

-- The following example uses both TRUNCATE() and ROUND() function for comparison

SELECT TRUNCATE(1.999,1), ROUND(1.999,1);