package sg.edu.nus.iss.vttp5a_ssf_day12w.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"", "index.html"})
public class HomeController {
    
    @GetMapping("")
    public String indexHome() {
        return "index";
    }
    
}
