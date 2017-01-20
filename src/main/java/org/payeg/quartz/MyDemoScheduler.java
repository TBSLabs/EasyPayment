package org.payeg.quartz;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyDemoScheduler {

	
	@Scheduled(fixedDelay=1000)
	public void runBuild(){
		 try {
			Jsoup.connect("http://localhost:8080/?from=scheduler").get();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
