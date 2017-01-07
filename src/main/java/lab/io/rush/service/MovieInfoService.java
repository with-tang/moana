 package lab.io.rush.service;

import java.util.Date;
import java.util.List;

import lab.io.rush.dto.BuyDetail;
import lab.io.rush.model.MovieInfo;

public interface MovieInfoService
{

	/**
	 * 获取所有电影信息，用于展示在前台页面
	 * @return
	 */
	public List<MovieInfo> queryMovieList();	
	/**
	 *   执行抢购动作，返回抢购后的电影信息
	 * @param userId
	 * @param movieId
	 * @param moiveCount
	 * @param createTime
	 * @return
	 */
	public BuyDetail executeBuy(long userId,long movieId,int moiveCount,Date createTime);
}
