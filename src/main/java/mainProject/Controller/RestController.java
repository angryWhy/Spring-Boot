package mainProject.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/get")
    public String get(){
        return "发送了，get请求";
    }

    @PostMapping("/post")
    public String post(){
        return "发送了，post请求";
    }
    @DeleteMapping("/del")
    public String del(){
        return "发送了，del请求";
    }
    @PatchMapping("/patch")
    public String patch(){
        return "发送了，patch 请求";
    }
}
