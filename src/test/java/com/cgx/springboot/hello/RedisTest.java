package com.cgx.springboot.hello;

import com.cgx.springboot.hello.config.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedisConfig.class)
public class RedisTest {

    @Autowired
   private RedisTemplate redisTemplate ;

    @Test
    public void testPutAndGet(){
        redisTemplate.opsForValue().set("date",new Date().toLocaleString());
        String dateStr = (String) redisTemplate.opsForValue().get("date");
        System.out.println("取redis-key:date="+dateStr);

    }
}
