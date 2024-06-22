package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.varun.lc.dto.UserInfoDTO;

@Controller
public class HomeController {

    @GetMapping("/")
    public String test(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO){
        return "home-page";
    }

    @GetMapping("/process-homepage")
    public String processHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO){
        return "result-page";
    }

}
