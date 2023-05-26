package SpringBootContext.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @RequestMapping("/myboot")
    public String runBoot(){
        return "my-boot,contoller";
    }
}
