package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.varun.lc.dto.UserRegistrationDTO;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String register(@ModelAttribute("userReg") UserRegistrationDTO dto) {

        /*Phone phone = new Phone();
        phone.setCountryCode("91");
        phone.setNumber("2233445566");
        CommunicationDto communicationDto = new CommunicationDto();
        communicationDto.setPhone(phone);
        dto.setCommunicationDto(communicationDto);*/

        return "register-page";
    }

    @GetMapping("/process-registration")
    public String processRegistration(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult bindingResult) {
        System.out.println("In registration process");
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(error -> System.out.println(error.getDefaultMessage()));
            return "register-page";
        }
        return "process-registration";
    }
}
