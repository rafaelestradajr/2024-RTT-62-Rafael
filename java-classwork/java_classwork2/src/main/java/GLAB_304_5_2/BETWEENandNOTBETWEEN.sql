SELECT product_code, product_name, buy_price
FROM products
WHERE buy_price BETWEEN 90 AND 100;

-- You can achieve the same effect by using the greater than or equal to (>=)
-- and the less than or equal to ( <= ) operators, as in the following query:
SELECT product_code, product_name, buy_price
FROM products
WHERE buy_price >= 90 AND buy_price <= 100;


-- To find the product whose buy price is not between $20 and $100, you can
-- combine the BETWEEN operator with the NOT operator as follows:

SELECT product_code, product_name, buy_price FROM products
WHERE buy_price NOT BETWEEN 20 AND 100;

-- You can rewrite the query above using the less than (>), greater than (>), and
-- logical operator (AND) as the following query.

SELECT product_code, product_name, buy_price FROM products
WHERE buy_price < 20 OR buy_price > 100;
