package admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/admin")
public class LoginController {
    @RequestMapping("/login")

    public String index(ModelMap map){

        return "admin/login/index";
    }
}
