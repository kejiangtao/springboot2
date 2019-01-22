package admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;
@Controller
@RequestMapping("/admin")
public class IndexController {
    @RequestMapping(value = {"/","/index"})

    public String index(ModelMap map){
        map.addAttribute("message", "柯江涛");
        return "admin/index/index";
    }

}
