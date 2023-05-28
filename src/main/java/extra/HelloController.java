package extra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //返回String字符串
    @RequestMapping("/he2")
    @ResponseBody
    public String hello(){
        return "hello,springboot2";
    }
    @RequestMapping("/err")
    @ResponseBody
    public String err(){
        return "hello,err";
    }
}
