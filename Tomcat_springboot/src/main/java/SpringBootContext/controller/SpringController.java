package SpringBootContext.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @RequestMapping("/hi")
    public String runBoot(){
        return "my-boot,contoller";
    }
}
