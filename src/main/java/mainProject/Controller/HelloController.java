package mainProject.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
    //返回String字符串
    @Value("${my.website}")
    private String website;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(website);
        return "hello,springboot";
    }
}
