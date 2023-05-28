package mainProject.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 在Controller方法调用前拦截请求并处理逻辑
        String requestUrl = request.getRequestURL().toString();
        HttpSession session = request.getSession();
        System.out.println("请求前！！！"+"url-"+requestUrl+"00000000000 "+"session-"+session);



        return true; // 如果返回false，请求将被中断
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 在Controller方法调用后、视图渲染前拦截请求并处理逻辑
        System.out.println("Controller方法调用后！！！");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 在整个请求完成后拦截请求并处理逻辑
        System.out.println("请求后！！！");
    }
}
