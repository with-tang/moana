--秒杀存储过程
DELIMITER $$ --; TO $$
--定义存储过程
CREATE PROCEDURE execute_buy(
in v_user_id   bigint,
in v_movie_id  bigint,
in v_movie_count int,
in v_create_time  timestamp,
out r_result int)
begin
	declare v_insertCount int default 0;
	declare v_updateCount int default 0;
	start transaction;
	/*insert buy detail  and reduce the number of ticket repository*/
	insert ignore into buy_info(user_id,movie_id,movie_count,create_time)
    	values(v_user_id,v_movie_id,v_movie_count,v_create_time);  	
    select row_count() into v_insertCount;
   if (v_insertCount<0) then
   	 rollback;
    	set r_result=-2;
   	 elseif (v_insertCount=0) then
  	  rollback;
   	 set r_result=-1;
	else
		update movie_info 
		set movie_count=movie_count-1
		where movie_count>0 
		and movie_id=v_movie_id;
		select row_count() into v_updateCount;
		 if (v_updateCount<0) then
		    rollback;
		    set r_result=-2;
		    elseif (v_updateCount=0) then
		    rollback;
		    set r_result=-1;
			else
			commit;
			set r_result=1;
		end if;
  end if;
end;


delimeter ;
--初始化
set @r_result=-3;
--调用存储过程
call execute_buy(1,1,2,now(),@r_result);
--获取结果
select @r_result;