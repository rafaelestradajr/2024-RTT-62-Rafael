SELECT customer_name, country, sales_rep_employee_id
FROM customers
WHERE customers.sales_rep_employee_id IS NULL
ORDER BY customer_name;



-- The below query uses the IS NOT NULL operator to get the customers
 --   who have a sales representative:
SELECT customer_name, country, sales_rep_employee_id
FROM customers
WHERE customers.sales_rep_employee_id IS NOT NULL
ORDER BY customer_name;

-- The following query uses the LEFT JOIN predicate and the IS NULL operator
-- to find customers who have no order:

SELECT c.id as customerNumber, c.customer_name, customer_id,
       o.STATUS
FROM customers c
         LEFT JOIN orders o
                   ON c.id = o.id
WHERE customer_id IS NULL;