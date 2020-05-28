package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {

    public static final String CONVERT = "convert";

    @GetMapping("/convert")
    public String convertForm() {
        return "convert";
    }

    @PostMapping("/convert")
    public ModelAndView convert(@RequestParam("usd") String money, @RequestParam("rate") String rate) {
        System.out.println("money " + money);
        System.out.println("rate " + rate);
        ModelAndView modelAndView = new ModelAndView(CONVERT);
        try {
            double usd = Double.parseDouble(money);
            double rateEx = Double.parseDouble(rate);
            modelAndView.addObject("result", usd * rateEx);
        } catch (NumberFormatException ex) {
            modelAndView.addObject("result", "Error");
        }
        modelAndView.addObject("usd", money);
        modelAndView.addObject("rate", rate);
        return modelAndView;
    }
}
