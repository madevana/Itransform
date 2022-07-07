package com.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit")
public class CreditCardController {

   
@GetMapping("/validate")
    public String validateCreditCard(@PathVariable("cardNo") String cardNo){
        CardValidator cardValidator = new CardValidator();
        cardValidator.setCardNo(cardNo);
        String res = cardValidator.isValidCard();
        return  res;
    }
}
