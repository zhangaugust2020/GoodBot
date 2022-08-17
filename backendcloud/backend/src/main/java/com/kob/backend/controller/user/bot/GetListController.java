package com.kob.backend.controller.user.bot;

import com.kob.backend.pojo.Bot;
import com.kob.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author August
 * @date 2022/7/29 - 21:44
 */
@RestController
@RequestMapping("/user/bot")
public class GetListController {

    @Autowired
    private GetListService getListService;

    @GetMapping("/getlist")
    public List<Bot> getList() {
        return getListService.getList();
    }
}
