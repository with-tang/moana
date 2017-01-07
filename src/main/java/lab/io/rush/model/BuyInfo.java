package lab.io.rush.model;

import java.util.Date;

public class BuyInfo
{
	
	private int buyCount;
	
	private Date createTime;
	
	private int movieId;
	
	private int userId;
	
	private int buyId;
	public int getBuyCount()
	{
		return buyCount;
	}
	public void setBuyCount(int buyCount)
	{
		this.buyCount = buyCount;
	}
	public Date getCreateTime()
	{
		return createTime;
	}
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	public int getMovieId()
	{
		return movieId;
	}
	public void setMovieId(int movieId)
	{
		this.movieId = movieId;
	}
	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public int getBuyId()
	{
		return buyId;
	}
	public void setBuyId(int buyId)
	{
		this.buyId = buyId;
	}
	@Override
	public String toString()
	{
		return "BuyInfo [buyCount=" + buyCount + ", createTime=" + createTime
				+ ", movieId=" + movieId + ", userId=" + userId + ", buyId="
				+ buyId + "]";
	}
	
}
/*
*movie_count int not null comment '购买张数',
create_time timestamp default current_timestamp comment '购买时间'
*
*/
