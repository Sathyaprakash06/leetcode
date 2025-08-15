# Write your MySQL query statement below
select employee_id from (SELECT e.employee_id
FROM Employees e
LEFT JOIN Salaries s ON e.employee_id = s.employee_id where e.name is null or s.salary is null
UNION
SELECT s.employee_id
FROM Employees e
RIGHT JOIN Salaries s ON e.employee_id = s.employee_id where e.name is null or s.salary is null) as temp order by employee_id