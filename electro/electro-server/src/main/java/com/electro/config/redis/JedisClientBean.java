package com.electro.config.redis;

import lombok.AllArgsConstructor;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;

@AllArgsConstructor
@EnableConfigurationProperties(RedisConfiguration.class)
public class JedisClientBean {

    private final RedisConfiguration redisConfiguration;

    @Bean
    public JedisClientConfiguration getJedisClientConfiguration() {
        final var configuration = redisConfiguration.getJedis().getPool();
        JedisClientConfiguration.JedisPoolingClientConfigurationBuilder jedisPoolingClientConfigurationBuilder = (JedisClientConfiguration.JedisPoolingClientConfigurationBuilder) JedisClientConfiguration
                .builder();
        final var genericObjectPoolConfig = new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxTotal(configuration.getMaxActive());
        genericObjectPoolConfig.setMaxIdle(configuration.getMaxIdle());
        genericObjectPoolConfig.setMinIdle(configuration.getMinIdle());
        return jedisPoolingClientConfigurationBuilder.poolConfig(genericObjectPoolConfig).build();
    }

}