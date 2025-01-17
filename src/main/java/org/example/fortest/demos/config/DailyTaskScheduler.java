package org.example.fortest.demos.config;

import org.example.fortest.demos.web.BasicController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DailyTaskScheduler {
    @Autowired
    private BasicController basicController;

    /**
     * cron = "0 0 0 * * ?"
     * 含义：在每天的 0 点 0 分 0 秒 执行
     */
    @Scheduled(cron = "0 0 0 * * ?")
    public void runTaskAtMidnight() {
        basicController.hello(0);
        basicController.prod_isFinished(0);
        basicController.erm_isFinished(0);
        basicController.erm_results="";
        basicController.prod_results="";
    }
}
