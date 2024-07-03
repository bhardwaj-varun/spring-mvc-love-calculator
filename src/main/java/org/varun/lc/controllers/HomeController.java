package org.varun.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.varun.lc.dto.BillDto;
import org.varun.lc.dto.Card;
import org.varun.lc.dto.UserInfoDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@SessionAttributes("userInfo") // this work only with model and not with ModelAttributes
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("userInfo", new UserInfoDTO());
        return "home-page";
    }

    @GetMapping("/process-homepage")
    public String processHomepage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult bindingResult,
                                  HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("userName", userInfoDTO.getUserName());

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

    @InitBinder
    public void InitBinder(WebDataBinder dataBinder){
//        CardDetailsPropertyEditor cardDetailsPropertyEditor =  new CardDetailsPropertyEditor();
//        dataBinder.registerCustomEditor(Card.class, "card",cardDetailsPropertyEditor);

    }
}
