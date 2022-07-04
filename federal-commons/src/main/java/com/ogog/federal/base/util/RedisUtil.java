package com.ogog.federal.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * <b>Redis 操作工具类<b>
 * @author orderuniverse
 * @date 2022/7/4
 */
@Component("regisUtil")
public class RedisUtil {
	@Autowired
	private StringRedisTemplate redisTemplate;

	/**
	 * <b>根据 key 将对应的 value 存储到 Redis 中</b>
	 * @param key
	 * @param value
	 * @param expireSec
	 * @throws Exception
	 */
	public boolean saveToRedis(String key, Object value, Integer expireSec) throws Exception {
		// 将所保存的 value 变为 JSON
		// 创建 JsonMapper
		JsonMapper jsonMapper = new JsonMapper();
		// 将 Object 类型的 value 变为 String 类型的 JSON
		String jsonValue = jsonMapper.writeValueAsString(value);
		// 根据 key，将 value 存储到 Redis 中
		redisTemplate.opsForValue().set(key, jsonValue);
		// 判断是否设置存储的时长
		if (expireSec != null && expireSec > -1) {
			// 设置存储时间
			redisTemplate.expire(key, expireSec, TimeUnit.SECONDS);
		}
		return true;
	}

	/**
	 * <b>根据 key 从 Redis 中获取 value</b>
	 * @param key
	 * @param typeClass
	 * @throws Exception
	 */
	public Object getFromRedis(String key, Class typeClass) throws Exception {
		// 根据 key 从 Redis 取出对应的 JSON 信息
		String jsonValue = redisTemplate.opsForValue().get(key);
		if (jsonValue != null) {
			// 根据所给定的类型，将 String 变为对应对象
			// 创建 JsonMapper
			JsonMapper jsonMapper = new JsonMapper();
			// 根据所给定的类型，进行转换
			return jsonMapper.readValue(jsonValue, typeClass);
		}
		return null;
	}

	/**
	 * <b>根据 key 将信息从 Redis 中移除</b>
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public boolean deleteFromRedis(String  key)throws Exception{
		return	redisTemplate.delete(key);
	}
}
