/* Write your PL/SQL query statement below */
select e.name,b.bonus from Employee e,Bonus B
where e.empId=b.empId(+)  and (b.Bonus<1000 or b.Bonus is null);