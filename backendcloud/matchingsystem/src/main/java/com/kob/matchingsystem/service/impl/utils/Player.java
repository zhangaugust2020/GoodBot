package com.kob.matchingsystem.service.impl.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author August
 * @date 2022/8/17 - 15:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private Integer userId;
    private Integer rating;
    private Integer botId;
    private Integer waitingTime; // 等待时间

}
