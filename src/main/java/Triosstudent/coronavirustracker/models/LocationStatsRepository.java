package Triosstudent.coronavirustracker.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.GetMapping;

public interface LocationStatsRepository  extends MongoRepository<LocationStats, String> {

@GetMapping


    static void save(int latestCases) {
    }
}
