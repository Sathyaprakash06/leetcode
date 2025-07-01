# Write your MySQL query statement below
select  distinct views.author_id as id
from views
where views.author_id = views.viewer_id
order by id;