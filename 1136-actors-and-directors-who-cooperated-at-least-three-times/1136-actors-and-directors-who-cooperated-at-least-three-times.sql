# Write your MySQL query statement below
select a.actor_id ,a.director_id
from actordirector a
group by a.actor_id,a.director_id
having count(a.actor_id)>=3 and  count(a.director_id)>=3
