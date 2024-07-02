package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.varun.lc.dto.Amount;
import org.varun.lc.dto.BillDto;
import org.varun.lc.dto.Card;
import org.varun.lc.dto.UserInfoDTO;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

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

    @GetMapping("/bill")
    public String bill(@ModelAttribute("billingInfo")BillDto billDto){

        Card card = new Card();
        card.setFirstFourDigits("1234");
        card.setSecondFourDigits("5678");
        card.setThirdFourDigits("ABCD");
        card.setFourthFourDigits("EFGH");
        billDto.setCard(card);
        return "bill-page";
    }

    @GetMapping("/process-bill")
    public String processBill(@ModelAttribute("billingInfo") BillDto billDto){
        return "bill-success-page";
    }

}
