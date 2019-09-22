1.procedure to calculate the total amount the contracter needs to pay to his workers:
create procedure  u_worker
as  
begin
select idworker,sum(salary) as totalamount
from workers
group by idworker
end
execute u_worker



2.trigger to insert into the worker table:
create trigger trigger_insert
on worker
after insert
as
begin
select * from inserted
end
insert into worker values(1,'Nauman','Mysore',9985741256,9000);


3.trigger to update whenever the changes are made in the worker table:
create trigger trigger_deleted
on worker
after update
as
begin
select * from deleted
end
update worker set salary=10000 where Phone_no=9985471256;