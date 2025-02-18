package com.electro.config.redis;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfiguration {

    private final String host;
    private final Integer port;
    private final Jedis jedis;


    @Data
    @RequiredArgsConstructor
    public static class Jedis {
        private final Pool pool;
        @Data
        @RequiredArgsConstructor
        public static class Pool {
            private final Integer maxActive;
            private final Integer maxIdle;
            private final Integer minIdle;

        }
    }
}
