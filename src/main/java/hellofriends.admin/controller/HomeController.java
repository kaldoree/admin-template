package hellofriends.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String indexPage() throws Exception {
        return "index";
    }

    @RequestMapping("sample/main")
    public String sampleMain() throws Exception {
        return "sample/main";
    }

    @RequestMapping("deok")
    public String deokPage() throws Exception {
        return "deok";
    }
}
