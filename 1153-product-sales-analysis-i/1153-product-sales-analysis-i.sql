# Write your MySQL query statement below
select product.product_name,sales.year,sales.price
from sales sales
 join product product on sales.product_id=product.product_id;