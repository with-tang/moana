package lab.io.rush.dao.cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import lab.io.rush.model.UserInfo;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisDao
{
	private  JedisPool jedisPool;
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	private RuntimeSchema<UserInfo> schema=RuntimeSchema.createFrom(UserInfo.class);
	public RedisDao(String ip,int port)
	{
		jedisPool=new JedisPool(ip,port);	
	}
	//从缓存中取seckill
	/**
	 * 
	 * @param secKillId
	 * @return
	 */
	public UserInfo getSecKill(long secKillId)
	{
		try
		{
			 Jedis jedis=jedisPool.getResource();
			 try{
				 String  key="secKill:";//+userInfo;
				 //getByte[]->反序列化->object seckill
				 //采用自定义序列化
				 byte[] bytes=jedis.get(key.getBytes());
				 if(bytes!=null)
				 {					 
					 UserInfo secKill=schema.newMessage();
					 //反序列化，给secKill对象赋值
					 ProtostuffIOUtil.mergeFrom(bytes, secKill, schema);
					 return secKill;
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
	 * 往Redis中存seckill
	 * @param secKill
	 * @return
	 */
	public String putSecKill(UserInfo userInfo)
	{
		//object-> bytes->reids	
				try
		{
					Jedis jedis=jedisPool.getResource();
				try{
					String key="secKill:";//+userInfo.getSecKillId();
					byte[] bytes=ProtostuffIOUtil.toByteArray(userInfo,schema,
						LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));	
					//60分钟
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

