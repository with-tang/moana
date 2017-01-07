package lab.io.rush.model;



public class UserInfo
{

	private long userPhone;

	private String userName;

	private String userQQ;

	private String userEmail;

	private String userPassword;
	public String getUserPassword()
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword)
	{
		this.userPassword = userPassword;
	}
	public long getUserPhone()
	{
		return userPhone;
	}
	public void setUserPhone(long userPhone)
	{
		this.userPhone = userPhone;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserQQ()
	{
		return userQQ;
	}
	public void setUserQQ(String userQQ)
	{
		this.userQQ = userQQ;
	}
	public String getUserEmail()
	{
		return userEmail;
	}
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}
	@Override
	public String toString()
	{
		return "UserInfo [userPhone=" + userPhone + ", userName=" + userName
				+ ", userQQ=" + userQQ + ", userEmail=" + userEmail
				+ ", userPassword=" + userPassword + "]";
	}
	
	
}
/*
 * user_id  bigint   not null primary key comment '用户id' ,
user_name varchar(120) comment '用户姓名',
user_phone bigint comment '用户电话',
user_qq varchar(100) comment 'qq',
user_email varchar(120) comment 'email'
 */
