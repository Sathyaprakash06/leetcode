# Write your MySQL query statement below
select customer.name as customers
from customers customer
left join orders  on customer.id=orders.customerId
where orders.id is null;