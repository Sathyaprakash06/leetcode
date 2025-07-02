# Write your MySQL query statement below
select orders.customer_number
from orders
group by orders.customer_number
order by count(*) desc limit 1;