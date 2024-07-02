package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.varun.lc.dto.UserRegistrationDTO;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String register(@ModelAttribute("userReg") UserRegistrationDTO dto) {
        return "register-page";
    }

    @GetMapping("/process-registration")
    public String processRegistration(@ModelAttribute("userReg") UserRegistrationDTO dto) {
        return "process-registration";
    }
}
