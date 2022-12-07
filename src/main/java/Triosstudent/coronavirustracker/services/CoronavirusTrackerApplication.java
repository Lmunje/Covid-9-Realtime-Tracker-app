package Triosstudent.coronavirustracker.services;

import Triosstudent.coronavirustracker.models.LocationStats;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableScheduling

public class CoronavirusTrackerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusTrackerApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {


	}
}
//
//               coronaVirusDataService.save(totalNewCases);
//			   coronaVirusDataService.save(totalReportedCases);
//			   System.out.println("*********************");