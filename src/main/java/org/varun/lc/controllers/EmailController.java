package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.varun.lc.dto.EmailDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class EmailController {

    @GetMapping("/send-email")
    public String sendMail(@ModelAttribute("emailInfo")EmailDto emailDto){
        return "send-email-page";
    }

    @GetMapping("/process-email")
    public String processMail(@ModelAttribute("emailInfo")EmailDto emailDto){

        return "process-email-page";
    }
}
