package mainProject.Controller;

import bean.Tiger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class YmalController {
    @Resource
    private Tiger tiger;

    @RequestMapping("/getMonster")
    public Tiger getMonster(){
        System.out.println(tiger);
        return tiger;
    }
}
