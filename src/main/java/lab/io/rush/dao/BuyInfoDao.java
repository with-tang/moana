package lab.io.rush.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import lab.io.rush.model.BuyInfo;

public interface BuyInfoDao
{ 

	/**
	 * 插入购买记录
	 * @param userId
	 * @param movieId
	 * @param moiveCount
	 * @param createTime
	 * @return
	 */
	public int insertBuyInfo(long userId,long movieId,int moiveCount,Date createTime);
	/**
	 * 通过用户Id查询购买的电影票
	 * @param userId
	 * @return
	 */
	public BuyInfo queryById(@Param("userId")long userId,@Param("createTime") Date createTime);
	/**
	 * 调用存储过程处理抢购
	 * @param userId
	 * @param movieId
	 * @param moiveCount
	 * @param createTime
	 * @return
	 */
	public int executeBuy(@Param("userId")long userId,
			@Param("movieId")long movieId,
			@Param("movieCount")int moiveCount,
			@Param("createTime")Date createTime);
	
}
