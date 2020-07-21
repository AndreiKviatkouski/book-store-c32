package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/addToBasket")
public class AddToBasketController {

    @GetMapping
    public String form(){
        return "accountOption/basket";
    }
}