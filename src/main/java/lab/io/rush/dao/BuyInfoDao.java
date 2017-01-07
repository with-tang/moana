package lab.io.rush.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import lab.io.rush.model.BuyInfo;

public interface BuyInfoDao
{ 

	/**
	 * ���빺���¼
	 * @param userId
	 * @param movieId
	 * @param moiveCount
	 * @param createTime
	 * @return
	 */
	public int insertBuyInfo(long userId,long movieId,int moiveCount,Date createTime);
	/**
	 * ͨ���û�Id��ѯ����ĵ�ӰƱ
	 * @param userId
	 * @return
	 */
	public BuyInfo queryById(@Param("userId")long userId,@Param("createTime") Date createTime);
	/**
	 * ���ô洢���̴�������
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
