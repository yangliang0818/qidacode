package com.shqida.demo.api.redis;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisShardInfo;

/**
 * @Copyright (C), 2012-2022 上海骑达科技 版权所有
 * @Website www.shqida.com
 * @Author: Created by YangLiang
 * @Date: 2017/6/4
 * @Version: 1.0.0
 * @Description:
 * @History: 变更记录
 * <author>           <time>             <version>        <desc>
 * YangLiang          2017/6/4            00000001         创建文件
 */
public class RedisTest {
    public static void main(String[] args) {
        RedisTemplate redisTemplate = new RedisTemplate();
        JedisShardInfo jedisShardInfo = new JedisShardInfo("172.16.10.35");
        JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
        redisConnectionFactory.setDatabase(1);
        redisConnectionFactory.setShardInfo(jedisShardInfo);
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        redisTemplate.afterPropertiesSet();
        String key = "project_pool";
        RedisLock lock = new RedisLock(redisTemplate, key, 10000, 20000);
        try {
            if (lock.lock()) {
                //需要加锁的代码
                System.out.println(1111);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } finally {
            //为了让分布式锁的算法更稳键些，持有锁的客户端在解锁之前应该再检查一次自己的锁是否已经超时，再去做DEL操作，因为可能客户端因为某个耗时的操作而挂起，
            //操作完的时候锁因为超时已经被别人获得，这时就不必解锁了。 ————这里没有做
            lock.unlock();
        }
    }
}
