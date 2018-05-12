package com.cgx.springboot.hello.redis;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableAutoConfiguration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory getRedisFactoryBean(){
        JedisPoolConfig jpl = new JedisPoolConfig();
        jpl.setMaxWaitMillis(10000L);
        JedisConnectionFactory redisConnectionFactory =
                new JedisConnectionFactory(jpl);
        return  redisConnectionFactory;
    }

    @Bean
    public RedisTemplate getRedisTemplete(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(getRedisFactoryBean());
        return redisTemplate;
    }

    public void getJedisClient(){

      //  JedisCluster jedisCluster = new JedisCluster();
    }
}
