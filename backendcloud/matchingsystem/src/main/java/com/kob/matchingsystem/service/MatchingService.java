package com.kob.matchingsystem.service;

/**
 * @author August
 * @date 2022/8/17 - 14:48
 */
public interface MatchingService {
    public String addPlayer(Integer userId, Integer rating);

    public String removePlayer(Integer userId);
}
