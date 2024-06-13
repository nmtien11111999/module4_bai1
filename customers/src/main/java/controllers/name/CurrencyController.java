package controllers.name;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/admin")
public class CurrencyController {
    @GetMapping(value = "/list")
    public String list() {
        return "list";
    }

    @PostMapping(value = "/result")
    public String convert(@RequestParam double rate , @RequestParam int usd , Model model) {
        double vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "result";
    }
}
