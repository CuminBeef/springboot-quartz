package com.adonis.app.springbootquartz.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledDemo {
	@Scheduled(cron = "0/2 * * * * ?")
	public void scheduledMethod() {
		System.out.println("定时器被触发" + new Date());
	}
}
