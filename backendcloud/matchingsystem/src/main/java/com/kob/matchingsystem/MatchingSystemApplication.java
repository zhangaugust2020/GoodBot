package com.kob.matchingsystem;

import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author August
 * @date 2022/8/17 - 14:40
 */
@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args) {
        MatchingServiceImpl.MATCHING_POOL.start(); // 启动匹配线程
        SpringApplication.run(MatchingSystemApplication.class, args);
    }
}
