package com.offcn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zjc
 * @create 2019--12--04--22:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/applicationContext-redis.xml")
public class redisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    //设置字符串
    @Test
    public void testStr(){
        redisTemplate.boundValueOps("a").set("you are my destiny");
    }
    //读取字符串
    @Test
    public void testStr2(){
       String s = (String) redisTemplate.boundValueOps("a").get();
        System.out.println("读取:" +s);
    }
}
