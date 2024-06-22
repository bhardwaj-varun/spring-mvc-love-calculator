package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.varun.lc.dto.UserInfoDTO;

@Controller
public class HomeController {

    @GetMapping("/")
    public String test(Model model){
        model.addAttribute("userInfo", new UserInfoDTO());
        return "home-page";
    }

    @GetMapping("/process-homepage")
    public String processHomepage(UserInfoDTO userInfoDto,
                                  Model model){
        model.addAttribute("userInfo", userInfoDto);
        return "result-page";
    }

}
