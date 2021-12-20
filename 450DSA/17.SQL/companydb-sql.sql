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

select sum(hours),pno from works_on join ( select * from project where dnum=5) t1 on pno=t1.pnumber group by pno order by pno asc;

select year(curdate()) -year(bdate) as age from employee order by age asc;

select essn, sum(hours) from works_on group by essn having sum(hours) >= 10 order by essn;

select fname from employee t2 ,(select dno,avg(salary) as s from employee group by dno) as t1 where t1.dno=t2.dno and t2.salary>t1.s order by t2.fname asc;

select fname from employee where fname like '%s%' order by fname;

select fname,lname,salary from employee where salary>=25000 order by lname;

select distinct plocation from project order by plocation;

select * from employee where year(bdate)>1950 and sex='M' order by salary;

select fname, lname, bdate ,salary from employee where super_ssn is NULL or salary<30000 order by bdate desc;

select * from employee where salary between 30000 and 50000 and sex='F' order by dno;

select fname from employee where ssn not in (select essn from dependent) order by fname;

select min(salary) from employee where dno=5;

select fname as First from employee order by fname asc;

select sex,sum(salary) from employee group by sex;

select count(*) from employee where dno=5

select t3.ssn,sum(t1.hours) from works_on t1 right outer join (select ssn from employee) as t3 on t1.essn=t3.ssn group by t3.ssn;

select min(salary) from employee where dno=4;

select dno,count(ssn) from employee where salary>30000 group by dno;

select distinct t2.essn from dependent t2 , (select essn,count(essn) as c from dependent group by essn) as t1 where t1.c>1 and t2.essn=t1.essn;

select essn,count(pno) as c FROM works_on group by essn having c>1;

select ssn,fname,dname from employee , (select * from department) as t1 where dno=t1.dnumber;

select ssn,fname from employee where dno=5 or dno=1;

select distinct lname from employee t1, (select essn from dependent where sex='F') as t2 where t2.essn=t1.ssn order by t1.lname;

select ssn,dno,salary from employee order by dno,salary;

select dname from department where mgr_start_date LIKE '1988%';

select pname from project t1, employee t2,works_on t3 where t3.essn=t2.ssn and t3.pno=t1.pnumber and t2.fname='Joyce' and t2.lname='English';

select t1.fname,t1.salary as EmpSalary,t2.salary as ManagerSalary from employee t1 join (select ssn,salary from employee) t2 where t2.ssn=t1.super_ssn order by fname;

select t1.fname,t1.salary as EmpSalary,t2.salary as ManagerSalary from employee t1 join (select ssn,salary from employee) t2 where t2.ssn=t1.super_ssn order by fname;

select t1.pname,count(t1.pnumber) from (select pname,pnumber from project , works_on where pno=pnumber) as t1  group by t1.pname order by pname;

select essn,fname,sum(hours) as totalhours from( select * from employee,works_on where ssn=essn ) as t1 group by essn having totalhours>=max(totalhours);

select ssn,dno,salary from employee where sex="F" order by dno,salary,ssn;

select dependent_name from dependent,employee where ssn=essn and fname="Franklin";







