package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoneyConvertController {
    @GetMapping("/")
    public ModelAndView showForm()
    {
        return new ModelAndView("/convert");
    }
    @PostMapping("/moneyConvert")
    public ModelAndView convert(@RequestParam double usd, double rate){
        double vnd= usd*rate;
        ModelAndView modelAndView= new ModelAndView("/result");
        modelAndView.addObject("usd",usd);
        modelAndView.addObject("rate",rate);
        modelAndView.addObject("vnd",vnd);
        return modelAndView;
    }



}
