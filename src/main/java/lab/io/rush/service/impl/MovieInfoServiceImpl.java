package lab.io.rush.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lab.io.rush.dao.BuyInfoDao;
import lab.io.rush.dao.MovieInfoDao;
import lab.io.rush.dto.BuyDetail;
import lab.io.rush.model.MovieInfo;
import lab.io.rush.service.MovieInfoService;
@Service("MovieInfoService")
public class MovieInfoServiceImpl implements MovieInfoService
{
	@Resource
	private MovieInfoDao movieInfoDao;
	@Resource
	private BuyInfoDao buyInfoDao;
	/**
	 * 获取所有电影信息，用于展示在前台页面
	 * @return
	 */
	public List<MovieInfo> queryMovieList()
	{
		List<MovieInfo> list=movieInfoDao.queryAll();
		return list;
	}
	/**
	 *   执行抢购动作，返回抢购后的电影信息
	 * @param userId
	 * @param movieId
	 * @param moiveCount
	 * @param createTime
	 * @return
	 */
	public BuyDetail executeBuy(long userId,long movieId,int moiveCount,Date createTime)
	{
		//需要在方法体中通过id取到电影和用户相关信息，再传给DTO，这里先不做实现
		int insertCount=buyInfoDao.executeBuy(userId, movieId, moiveCount, createTime);
		int buyCount=0;
		String movieName="";
		int movieMin=0;
		float moviePrice=0.0f;
		if(insertCount>0)
		{
			return new BuyDetail(movieId,userId,movieName,moviePrice,movieMin,createTime,buyCount);
		}
		else
			return null;
	}
}
