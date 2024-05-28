SELECT order_id, SUM(quantity_ordered) as Qty,
       IF(MOD(SUM(quantity_ordered),2),'Odd', 'Even') as oddOrEven
FROM orderdetails
GROUP BY order_id
ORDER BY order_id;