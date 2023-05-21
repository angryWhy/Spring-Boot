package springBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //返回String字符串
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello,springboot";
    }
}
