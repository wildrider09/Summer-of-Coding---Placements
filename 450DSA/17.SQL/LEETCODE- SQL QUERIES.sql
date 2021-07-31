--EASY LEVEL--

/*176. Second Highest Salary*/
select max(Salary) as SecondHighestSalary 
from 
employee where salary < (select max(salary) from employee);

/*181. Employees Earning More Than Their Managers*/
select e.name as Employee 
from employee e cross join employee m
on m.id=e.managerid where e.salary>m.salary

/*182. Duplicate Emails*/
select Email from person group by email having count(email)>1

/*183. Customers Who Never Order*/
select c.name as Customers 
from Customers c left join Orders o
on c.id=o.customerid where o.id is null

/*196. Delete Duplicate Emails*/
DELETE p1 FROM person p1 JOIN person p2 
on p1.email=p2.email
where p1.id > p2.id 

/*197. Rising temperature*/
select t1.id 
FROM Weather AS t1 JOIN Weather AS t2
WHERE DATEDIFF(t1.recordDate,t2.recordDate)=1 AND t1.temperature > t2.temperature

/*596. Classes More Than 5 Students*/
select class from
(select distinct student, class from courses) as t
group by class having count(class)>=5

/*620. Not Boring Movies*/
select id , movie , description , rating 
from cinema where id%2=1 AND description NOT LIKE ('boring')
order by rating desc

/*627. Swap Salary*/
update salary set sex= 
case
    When sex='m' then 'f'
    When sex='f' then 'm'
end

/*1179. Reformat Department Table*/

--MEDIUM LEVEL--

/*177. Nth Highest Salary*/
declare i INT;
set i=n-1;
  RETURN(
      select 
      (select distinct Salary from Employee order by Salary  Limit i,1 ) 
      as getNthHighestSalary
  );

/*178. Rank Scores*/
select s.score,
(select count(distinct score) from scores where score>=s.score) as 'Rank'
from scores as s
order by s.score desc

/*180. Consecutive Numbers*/
select DISTINCT t1.num as ConsecutiveNums
from logs as t1 
inner join logs t2 ON t1.id= (t2.id+1) AND t1.num=t2.num
inner join logs t3 ON t1.id= (t3.id+2) AND t1.num=t3.num

/*184. Department Highest Salary*/
SELECT d.name AS Department, e.name AS Employee, e.salary AS SALARY
FROM Employee AS e INNER JOIN Department as d
ON e.departmentid = d.id
WHERE e.salary= ( select max(salary) from employee t where e.departmentid=t.departmentid)

/*626. Exachange seats*/
select * from
    (select
        CASE
            WHEN t.id%2=1 AND t.id=(select max(id) from seat) THEN t.id
            WHEN t.id%2=1 THEN t.id+1
            WHEN t.id%2=0 THEN t.id-1
        END 
            AS id, t.student from seat t) AS s
    ORDER BY s.id ASC

/*Top 3 salaries from Department*/
Select e.name,e.salary,e.departmentid 
from Employee e 
WHERE 3 > (select count(distinct e2.Salary) 
           from Employee e2 where e2.Salary > e.Salary) 
ORDER BY e.salary DESC;

/*185. Department Top Three Salaries*/
Select d.name as Department , e.name as employee , e.salary 
from Employee AS e INNER JOIN Department as d
ON e.departmentid = d.id 
WHERE 3 > (select count(distinct e2.Salary)
           from Employee e2
           where e2.Salary > e.Salary
           and e.DepartmentId = e2.DepartmentId);


