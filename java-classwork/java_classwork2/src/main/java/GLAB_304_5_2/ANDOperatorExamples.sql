SELECT customer_name, country, credit_limit
FROM customers
WHERE (country = 'USA' OR country = 'France') AND
    credit_limit > 100000;



-- The below query will return the customers who are located in the USA or
-- the customers who are located in France with a credit limit greater than
-- 10000.

SELECT customer_name, country, credit_limit FROM customers
WHERE country = 'USA' OR country = 'France' AND credit_limit > 100000;