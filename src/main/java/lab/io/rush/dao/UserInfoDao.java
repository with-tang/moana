package lab.io.rush.dao;

import org.apache.ibatis.annotations.Param;

import lab.io.rush.model.UserInfo;

public interface UserInfoDao
{
	/**
	 * �û�ע�ᣬ�����û�����
	 * @param userPhone
	 * @param userQQ
	 * @param userEmail
	 * @param userName
	 * @return
	 */
	public int insertUserInfo(@Param("userPhone")long userPhone,
			@Param("userQQ")long userQQ,
			@Param("userEmail")String userEmail,
			@Param("userName")String userName);
	/**
	 * �����û�ID��ѯ�û���Ϣ
	 * 
	 * @param userId
	 * @return
	 */
	public UserInfo queryUserById(long userId);
}
