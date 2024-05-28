SELECT id, DATEDIFF(required_date, shipped_date) as daysLeft
FROM orders
ORDER BY daysLeft DESC;

-- The following statement gets all orders whose status is “In Process,” and calculates
-- the number of days between the ordered date and the required date:

SELECT id, DATEDIFF(required_date, order_date) as remaining_days
FROM orders
WHERE status = 'In Process'
ORDER BY remaining_days;

-- For calculating an interval in week or month, you can divide the returned value of
-- the DATEDIFF() function by 7 or 30 as the following query:

SELECT
    id,
    ROUND(DATEDIFF(required_date, order_date) / 7, 2),
    ROUND(DATEDIFF(required_date, order_date) / 30,2)
FROM orders
WHERE status = 'In Process';

