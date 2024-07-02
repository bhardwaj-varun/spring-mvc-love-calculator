package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.varun.lc.dto.UserRegistrationDTO;
import org.varun.lc.dto.UserInfoDTO;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO){
        return "home-page";
    }

    @GetMapping("/process-homepage")
    public String processHomepage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            System.out.println(allErrors);
            return "home-page";
        }
        return "result-page";
    }


}
