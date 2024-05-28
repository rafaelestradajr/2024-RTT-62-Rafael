SELECT DAY(order_date) as dayofmonth, COUNT(*)
FROM orders WHERE YEAR(order_date) = 2004
GROUP BY dayofmonth
ORDER BY dayofmonth;
