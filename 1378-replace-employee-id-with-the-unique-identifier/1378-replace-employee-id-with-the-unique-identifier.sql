/* Write your PL/SQL query statement below */
select u.unique_id,e.name from Employees e,employeeUNI u
where e.id=u.id(+);