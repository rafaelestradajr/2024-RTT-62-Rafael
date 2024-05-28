SELECT order_id, order_line_number, quantity_ordered * price_each as subtotal
FROM orderdetails
ORDER BY subtotal DESC