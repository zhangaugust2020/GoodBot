package com.kob.matchingsystem.service.impl;

import com.kob.matchingsystem.service.MatchingService;
import com.kob.matchingsystem.service.impl.utils.MatchingPool;
import org.springframework.stereotype.Service;

/**
 * @author August
 * @date 2022/8/17 - 14:52
 */
@Service
public class MatchingServiceImpl implements MatchingService {

    public static final MatchingPool MATCHING_POOL = new MatchingPool();

    @Override
    public String addPlayer(Integer userId, Integer rating) {
        System.out.println("add player: " + userId + " " + rating);
        MATCHING_POOL.addPlayer(userId, rating);
        return "add player success";
    }

    @Override
    public String removePlayer(Integer userId) {
        System.out.println("remove player: " + userId);
        MATCHING_POOL.removePlayer(userId);
        return "remove player success";
    }
}
