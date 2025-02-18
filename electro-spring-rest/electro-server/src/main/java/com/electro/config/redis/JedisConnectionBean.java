package com.electro.config.redis;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@AllArgsConstructor
@EnableConfigurationProperties(RedisConfiguration.class)
public class JedisConnectionBean {

    private final RedisConfiguration redisConfiguration;
    private final JedisClientConfiguration jedisClientConfiguration;

    @Bean
    public JedisConnectionFactory connectionFactory() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
        configuration.setHostName(redisConfiguration.getHost());
        configuration.setPort(redisConfiguration.getPort());
        return new JedisConnectionFactory(configuration, jedisClientConfiguration);
    }

}