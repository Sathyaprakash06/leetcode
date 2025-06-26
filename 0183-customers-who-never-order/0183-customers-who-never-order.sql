# Write your MySQL query statement below
select c.name as customers
from customers c
left join orders  on c.id=orders.customerId
where orders.id is null;