# Write your MySQL query statement below
select q.unique_id,e.name
from employees e
 left join employeeuni q on e.id=q.id
