package lab.io.rush.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lab.io.rush.model.MovieInfo;

public interface MovieInfoDao
{
	/**
	 * �����û������Ӱ
	 * @param movieId
	 * @return
	 */
	public List<MovieInfo> queryByUserId(@Param("movieId")long movieId,@Param("userId")long userId);
	/**
	 * ��ѯ���еĵ�Ӱ��Ϣ
	 * @return
	 */
	public List<MovieInfo> queryAll();
	
	/**
	 * ��ѯ������Ӱ
	 * @param movieId
	 * @return
	 */
	public MovieInfo queryById(long movieId);
}
