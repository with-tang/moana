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
	 * ��ȡ���е�Ӱ��Ϣ������չʾ��ǰ̨ҳ��
	 * @return
	 */
	public List<MovieInfo> queryMovieList()
	{
		List<MovieInfo> list=movieInfoDao.queryAll();
		return list;
	}
	/**
	 *   ִ����������������������ĵ�Ӱ��Ϣ
	 * @param userId
	 * @param movieId
	 * @param moiveCount
	 * @param createTime
	 * @return
	 */
	public BuyDetail executeBuy(long userId,long movieId,int moiveCount,Date createTime)
	{
		//��Ҫ�ڷ�������ͨ��idȡ����Ӱ���û������Ϣ���ٴ���DTO�������Ȳ���ʵ��
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
