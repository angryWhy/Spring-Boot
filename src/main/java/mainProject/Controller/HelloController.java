package mainProject.Controller;

import lombok.extern.slf4j.Slf4j;
import bean.Furn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@Slf4j
public class HelloController {
    //返回String字符串
//    @Value("${my.website}")
    private String website;
    @Resource
    private Furn furn;
    @RequestMapping("/hello")
    @ResponseBody
    public Furn hello(){
        log.info("furn-"+furn);
        log.info("furn={}",furn);
        System.out.println("Slf4j");
        return furn;
    }
    @RequestMapping("/furn")
    @ResponseBody
    public Furn furn(){
        System.out.println(website);
        return furn;
    }
}
