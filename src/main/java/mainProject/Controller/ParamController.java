package mainProject.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ParamController {

    @RequestMapping("/pathValue/{id}/{name}")
    public String get(@PathVariable("id") String id,@PathVariable("name") String name,@PathVariable Map<String,String> map){
        System.out.println(map);
        return id;
    }
}
