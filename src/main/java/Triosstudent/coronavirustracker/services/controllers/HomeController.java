//package Triosstudent.coronavirustracker.services.controllers;
//
//import Triosstudent.coronavirustracker.services.CoronaVirusDataService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class HomeController {
//
//    @Autowired
//    CoronaVirusDataService coronaVirusDataService;
//
//    @GetMapping("/")
//    public String home(Model model) {
//        model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
//        return "home";
//    }
//}
package Triosstudent.coronavirustracker.services.controllers;

import Triosstudent.coronavirustracker.models.LocationStats;
import Triosstudent.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public <TotalCases> String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat ->
                stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "home";
    }
}