package tiendz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(Model model) {
        String name = "tiến";
        model.addAttribute("name", name);
        return "index";
    }
}
