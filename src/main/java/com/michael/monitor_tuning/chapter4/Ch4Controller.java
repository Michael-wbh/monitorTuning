package com.michael.monitor_tuning.chapter4;

import com.michael.monitor_tuning.chapter1.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther hengli
 * @date 2018/11/7 17:37
 */
@RestController
@RequestMapping("ch4")
public class Ch4Controller {

    @RequestMapping("/arg1")
    public String arg1(@RequestParam("name") String name) {
        return "hello, " + name;
    }

    @RequestMapping("/constructor")
    public User constructor(User user) {
        return user;
    }
}
