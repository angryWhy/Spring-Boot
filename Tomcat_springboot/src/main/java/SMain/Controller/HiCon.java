package SMain.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiCon {
    @RequestMapping("/hi")
    public String hi(){
        return "hi,spring boot";
    }
}
