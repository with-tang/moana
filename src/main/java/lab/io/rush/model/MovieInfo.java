package lab.io.rush.model;

import java.util.Date;


public class MovieInfo
{
	
private String movieName;

private String moviePrice;

private int movieCount;

private int movieMin;

private Date movieStartTime;

@Override
public String toString()
{
	return "TicketsInfo [movieName=" + movieName + ", moviePrice=" + moviePrice
			+ ", movieCount=" + movieCount + ", movieMin=" + movieMin
			+ ", movieStartTime=" + movieStartTime + "]";
}
public String getMovieName()
{
	return movieName;
}
public void setMovieName(String movieName)
{
	this.movieName = movieName;
}
public String getMoviePrice()
{
	return moviePrice;
}
public void setMoviePrice(String moviePrice)
{
	this.moviePrice = moviePrice;
}
public int getMovieCount()
{
	return movieCount;
}
public void setMovieCount(int movieCount)
{
	this.movieCount = movieCount;
}
public int getMovieMin()
{
	return movieMin;
}
public void setMovieMin(int movieMin)
{
	this.movieMin = movieMin;
}
public Date getMovieStartTime()
{
	return movieStartTime;
}
public void setMovieStartTime(Date movieStartTime)
{
	this.movieStartTime = movieStartTime;
}


}
/*
 * movie_id bigint   not null primary key  comment '电影票ID',
movie_name varchar(120) comment '电影名称',
movie_price float comment '电影票价格',
movie_count int comment '剩余数量',
movie_start_time datetime comment '上映时间',
moive_min int  comment '影片时长'
 */