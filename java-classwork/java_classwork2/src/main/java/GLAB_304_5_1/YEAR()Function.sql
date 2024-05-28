SELECT YEAR(shipped_date) as year, COUNT(id) as
                            orderQty
FROM orders
GROUP BY YEAR(shipped_date)
ORDER BY YEAR(shipped_date);