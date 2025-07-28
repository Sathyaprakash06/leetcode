# Write your MySQL query statement below
select salesperson.name
from salesperson
where sales_id not in(
    select distinct orders.sales_id
    from orders
    join company on company.com_id=orders.com_id
    where company.name='RED'
);