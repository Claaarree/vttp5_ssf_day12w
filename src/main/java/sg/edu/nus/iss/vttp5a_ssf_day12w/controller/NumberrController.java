package sg.edu.nus.iss.vttp5a_ssf_day12w.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sg.edu.nus.iss.vttp5a_ssf_day12w.model.Numberr;
import sg.edu.nus.iss.vttp5a_ssf_day12w.service.NumberrService;

@Controller
@RequestMapping("/numbers")
public class NumberrController {
    @Autowired
    NumberrService numberService;

    @GetMapping()
        public String numbersToGenerate(@RequestParam String number, Model model){
            List<Numberr> generatedNumbers = numberService.generateNumbers(number);
            model.addAttribute("number", number);
            model.addAttribute("generatedNumbers", generatedNumbers);
            
            return "generatedNumbers";
        }
}
