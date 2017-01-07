package lab.io.rush.dao;

import org.apache.ibatis.annotations.Param;

import lab.io.rush.model.UserInfo;

public interface UserInfoDao
{
	/**
	 * 用户注册，插入用户数据
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
	 * 根据用户ID查询用户信息
	 * 
	 * @param userId
	 * @return
	 */
	public UserInfo queryUserById(long userId);
}
