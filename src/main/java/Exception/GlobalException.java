package Exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

import java.lang.reflect.Method;

@Controller
@Slf4j
//全局异常处理器
@ControllerAdvice
public class GlobalException {
    //编写方法，处理指定异常
    //处理的异常由自己指定
    @ExceptionHandler({ArithmeticException.class})
    public String handleArit(Exception exception, Model model, HandlerMethod handlerMethod){
        log.info("异常方法={}",handlerMethod.getMethod());
        //异常自己传，信息传入到model中
        return "/err/global";
    }
}
