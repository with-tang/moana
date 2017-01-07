package lab.io.rush.dao.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lab.io.rush.dao.BuyInfoDao;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/spring-dao.xml"})
public class BuyInfoDaoTest
{
	@Resource
	private BuyInfoDao buyInfoDao;
	@Test
	public void test()
	{
		//≤‚ ‘≥…π¶
		/*select * from movie_info where movie_id=1
		1	∞⁄∂…»À	100	298	2016-12-11 20:54:32	120*/
		Date createTime=new Date();		
		System.out.println(buyInfoDao);
		//int n=buyInfoDao.executeBuy(1, 1, 2, createTime);		
	}
}
