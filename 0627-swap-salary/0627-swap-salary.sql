# Write your MySQL query statement belup
update salary
set sex=CASE
when sex='m'then'f'
when sex='f'then'm'
else sex
end;