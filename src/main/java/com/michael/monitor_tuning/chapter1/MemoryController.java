package com.michael.monitor_tuning.chapter1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @auther hengli
 * @date 2018/11/7 10:50
 */
@RestController
public class MemoryController {

    private List<User> userList = new ArrayList<>();
    private List<Class<?>> classList = new ArrayList<>();
    /**
     * -Xmx32M -Xms32M 设置堆栈内存.
     * @return
     */
    @GetMapping("/heap")
    public String heap() {
        while (true) {
            int i = 0;
            userList.add(new User(i++, UUID.randomUUID().toString()));
        }
    }

    /**
     * -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
     * @return
     */
    @GetMapping("/nonheap")
    public String nonheap() {
        while (true) {
            classList.addAll(Metaspace.createClasses());
        }
    }
}
