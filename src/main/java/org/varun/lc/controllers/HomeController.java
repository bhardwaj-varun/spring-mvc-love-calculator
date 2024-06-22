package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String test(){
        return "home-page";
    }

    @GetMapping("/process-homepage")
    public String processHomepage(@RequestParam("user-name") String userName,
                                  @RequestParam("crush-name") String crushName,
                                  Model model){
        model.addAttribute("userName", userName);
        model.addAttribute("crushName", crushName);
        return "result-page";
    }

}
