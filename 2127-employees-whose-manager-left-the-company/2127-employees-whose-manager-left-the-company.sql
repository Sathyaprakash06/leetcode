# Write your MySQL query statement below
select c.employee_id
from employees c
where c.salary<30000 and c.manager_id not in (select c.employee_id from employees c)
order by c.employee_id asc