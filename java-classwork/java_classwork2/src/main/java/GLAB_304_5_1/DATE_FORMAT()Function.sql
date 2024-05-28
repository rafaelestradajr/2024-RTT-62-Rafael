SELECT
    id,
    DATE_FORMAT(order_date, '%Y-%m-%d') orderDate,
    DATE_FORMAT(required_date, '%a %D %b %Y') requireddate,
    DATE_FORMAT(shipped_date, '%W %D %M %Y') shippedDate
FROM orders;


-- Let’s use DATE_FORMAT() with the ORDER BY clause and review the following example

SELECT id as orderNumber,
       DATE_FORMAT(shipped_date, '%W %D %M %Y') as 'Shipped date'
FROM orders
ORDER BY shipped_date;