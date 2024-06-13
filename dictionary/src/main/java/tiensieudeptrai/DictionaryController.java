package tiensieudeptrai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/dictionary")
public class DictionaryController {
    private Map<String,String> dictionary = new HashMap<String,String>();

    public DictionaryController(){
        dictionary.put("ngu ngốc","stupid");
        dictionary.put("điên","crazy");
        dictionary.put("đáng yêu","cute");
        dictionary.put("tiến đẹp trai","tiến so handsome");
        dictionary.put("quảng","quảng siu toxic");
    }

    @GetMapping("/list")
    public String list(){
        return "search";
    }

    @GetMapping("/result")
    public String result(@RequestParam String word , Model model){
        String name = dictionary.get(word.toLowerCase());
        if(name != null){
            model.addAttribute("name", name);
            return "result";
        } else {
            model.addAttribute("name", "Not found");
            return "result";
        }
    }
}
