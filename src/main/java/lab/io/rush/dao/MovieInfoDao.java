package lab.io.rush.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lab.io.rush.model.MovieInfo;

public interface MovieInfoDao
{
	/**
	 * 返回用户购买电影
	 * @param movieId
	 * @return
	 */
	public List<MovieInfo> queryByUserId(@Param("movieId")long movieId,@Param("userId")long userId);
	/**
	 * 查询所有的电影信息
	 * @return
	 */
	public List<MovieInfo> queryAll();
	
	/**
	 * 查询单个电影
	 * @param movieId
	 * @return
	 */
	public MovieInfo queryById(long movieId);
}
