package mainProject.Controller;

import mainProject.bean.Furn;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller

public class HelloController {
    //返回String字符串
    @Value("${my.website}")
    private String website;
    @Resource
    private Furn furn;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(website);
        return "hello,springboot";
    }
    @RequestMapping("/furn")
    @ResponseBody
    public Furn furn(){
        System.out.println(website);
        return furn;
    }
}
