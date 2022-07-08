package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author August
 * @date 2022/7/8 - 10:40
 */
@RestController
@RequestMapping("/pk")
public class IndexController {

    @RequestMapping("/getBotInfo")
    public Map<String, String> getBotInfo() {
        Map<String, String> map = new HashMap();
        map.put("name", "1");
        map.put("rating", "2");
        return map;
    }

}
