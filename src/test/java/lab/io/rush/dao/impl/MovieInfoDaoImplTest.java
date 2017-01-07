package lab.io.rush.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lab.io.rush.dao.MovieInfoDao;
import lab.io.rush.model.MovieInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:spring/spring-dao.xml"	
})

public class MovieInfoDaoImplTest
{

	@Resource
	private MovieInfoDao movieInfo;
	@Test
	public void test()
	{
		List<MovieInfo> list=movieInfo.queryAll();
		for(MovieInfo s:list){
			System.out.println(s.getMovieName());
		}
		System.out.println(movieInfo);
	}

}
