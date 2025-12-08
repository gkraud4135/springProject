package com.deploy.springProject.scheduler;



import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class BatchScheduler {

    @Component
    public class SchedulerTask {

        //@Scheduled(fixedDelay = 1000) // 1초마다 실행
        @Scheduled(cron = "0 35 20 * * *")
        public void run() {
            System.out.println("start");
        }
    }
}
