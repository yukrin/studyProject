package cx.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello ,spring security!";
    }

    @RequestMapping("/test")
    public String test(Model model){
        //把数据存入model
        model.addAttribute("name", "吴先生");
        //返回test.html
        return "test";
    }
}
