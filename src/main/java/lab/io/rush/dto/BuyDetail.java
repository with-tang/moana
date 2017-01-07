package lab.io.rush.dto;

import java.util.Date;

public class BuyDetail
{
	private long movieId;
	private long userId;
	private String movieName;
	private float moviePrice;
	private int movieMin;
	//¹ºÂòÊ±¼ä
	private Date createTime;

	private int buyCount;
	public long getMovieId()
	{
		return movieId;
	}
	public void setMovieId(long movieId)
	{
		this.movieId = movieId;
	}
	public long getUserId()
	{
		return userId;
	}
	public void setUserId(long userId)
	{
		this.userId = userId;
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setMovieName(String movieName)
	{
		this.movieName = movieName;
	}
	public float getMoviePrice()
	{
		return moviePrice;
	}
	public void setMoviePrice(float moviePrice)
	{
		this.moviePrice = moviePrice;
	}
	public int getMovieMin()
	{
		return movieMin;
	}
	public void setMovieMin(int movieMin)
	{
		this.movieMin = movieMin;
	}
	public Date getCreateTime()
	{
		return createTime;
	}
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	public int getBuyCount()
	{
		return buyCount;
	}
	public void setBuyCount(int buyCount)
	{
		this.buyCount = buyCount;
	}
	public BuyDetail(long movieId, long userId, String movieName,
			float moviePrice, int movieMin, Date createTime, int buyCount)
	{
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.movieMin = movieMin;
		this.createTime = createTime;
		this.buyCount = buyCount;
	}
}
