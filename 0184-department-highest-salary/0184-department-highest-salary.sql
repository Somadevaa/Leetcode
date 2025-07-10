select d.name as Department,e.name Employee,e.salary salary 
from Employee e left join department d on d.id=e.departmentId
where (e.salary,e.departmentId) in (
    select max(salary),departmentId
    from employee
    group by departmentId
);