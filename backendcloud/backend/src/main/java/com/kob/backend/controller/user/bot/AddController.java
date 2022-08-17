package com.kob.backend.controller.user.bot;

import com.kob.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author August
 * @date 2022/7/29 - 19:04
 */
@RestController
@RequestMapping("/user/bot")
public class AddController {

    @Autowired
    private AddService addService;

    @PostMapping("/add")
    public Map<String, String> add(@RequestParam Map<String, String> data) {
        return addService.add(data);
    }
}
