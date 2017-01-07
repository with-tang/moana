 package lab.io.rush.service;

import java.util.Date;
import java.util.List;

import lab.io.rush.dto.BuyDetail;
import lab.io.rush.model.MovieInfo;

public interface MovieInfoService
{

	/**
	 * ��ȡ���е�Ӱ��Ϣ������չʾ��ǰ̨ҳ��
	 * @return
	 */
	public List<MovieInfo> queryMovieList();	
	/**
	 *   ִ����������������������ĵ�Ӱ��Ϣ
	 * @param userId
	 * @param movieId
	 * @param moiveCount
	 * @param createTime
	 * @return
	 */
	public BuyDetail executeBuy(long userId,long movieId,int moiveCount,Date createTime);
}
