package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.varun.lc.dto.CommunicationDto;
import org.varun.lc.dto.Phone;
import org.varun.lc.dto.UserRegistrationDTO;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String register(@ModelAttribute("userReg") UserRegistrationDTO dto) {

        Phone phone = new Phone();
        phone.setCountryCode("91");
        phone.setNumber("2233445566");
        CommunicationDto communicationDto = new CommunicationDto();
        communicationDto.setPhone(phone);
        dto.setCommunicationDto(communicationDto);

        return "register-page";
    }

    @GetMapping("/process-registration")
    public String processRegistration(@ModelAttribute("userReg") UserRegistrationDTO dto) {
        return "process-registration";
    }
}
