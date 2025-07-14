# Write your MySQL query statement below
select  c1.*
from cinema c1
where c1.id% 2= 1 and c1.description<>'boring'
order by c1.rating desc