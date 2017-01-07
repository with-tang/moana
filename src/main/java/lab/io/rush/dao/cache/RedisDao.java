package lab.io.rush.dao.cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import lab.io.rush.model.MovieInfo;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisDao
{
	private  JedisPool jedisPool;
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	private RuntimeSchema<MovieInfo> schema=RuntimeSchema.createFrom(MovieInfo.class);
	public RedisDao(String ip,int port)
	{
		jedisPool=new JedisPool(ip,port);	
	}
	//�ӻ�����ȡseckill
	/**
	 * 
	 * @param movieId
	 * @return
	 */
	public MovieInfo getMovieInfo(long movieId)
	{
		try
		{
			 Jedis jedis=jedisPool.getResource();
			 try{
				 String  key="movieInfo:";//+userInfo;
				 //getByte[]->�����л�->object seckill
				 //�����Զ������л�
				 byte[] bytes=jedis.get(key.getBytes());
				 if(bytes!=null)
				 {					 
					 MovieInfo movieInfo=schema.newMessage();
					 //�����л�����movieinfo����ֵ
					 ProtostuffIOUtil.mergeFrom(bytes, movieInfo, schema);
					 return movieInfo;
				 }
			 }
			 finally
			 {
				 jedis.close();
			 }
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
		}		
		return null;
	}
	/**
	 * ��Redis�д�movieInfo
	 * 
	 * @return
	 */
	public String putSecKill(MovieInfo movieInfo)
	{
		//object-> bytes->reids	
				try
		{
					Jedis jedis=jedisPool.getResource();
				try{
					String key="secKill:";//+userInfo.getSecKillId();
					byte[] bytes=ProtostuffIOUtil.toByteArray(movieInfo,schema,
						LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));	
					//60����
					int timeout=60 * 60;
					String result=jedis.setex(key.getBytes(), timeout, bytes);
					return result;
					
				}finally
				{
					jedis.close();
				}
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		return null;
		
	}
}

