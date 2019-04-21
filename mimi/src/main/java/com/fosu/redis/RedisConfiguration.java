package com.fosu.redis;

import java.lang.reflect.Method;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableCaching
public class RedisConfiguration extends CachingConfigurerSupport {

	/*
	 * key规则
	 */
	public KeyGenerator keyGenerator() {
		return new KeyGenerator() {

			@Override
			public Object generate(Object o, Method method, Object... objects) {
				// TODO Auto-generated method stub
				//格式化缓存key字符串
				StringBuilder sb = new StringBuilder();
				//追加类名
				sb.append(o.getClass().getName());
				//追加方法名
				sb.append(method.getName());
				//遍历参数并且追加
				for(Object obj : objects) {
					sb.append(obj.toString());
				}
				System.out.println("调用Redis缓存key:"+sb.toString());
				
				return sb.toString();
			}
			
		};
	}
	/*
	 * 采用RedisCacheManager作为缓存管理器
	 * 
	 */
	@Bean
	public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {
		RedisCacheManager redisCacheManager = RedisCacheManager.create(connectionFactory);
		return redisCacheManager;	
	}
	@Bean
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory factory)
	{
		//解决键、值序列化问题
		RedisTemplate redisTemplate = new StringRedisTemplate(factory);
	    StringRedisSerializer stringRedisSerializer =new StringRedisSerializer();
	    redisTemplate.setValueSerializer(stringRedisSerializer);
	    redisTemplate.setKeySerializer(stringRedisSerializer);
	    redisTemplate.setHashKeySerializer(stringRedisSerializer);
	    redisTemplate.setHashValueSerializer(stringRedisSerializer);
	    redisTemplate.afterPropertiesSet();
	    return redisTemplate;

	}
}
