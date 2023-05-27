package SpringBootContext;

import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//创建spring配置容器
//加载spring容器，按照朱姐的方式
//完成spring的配置注入，配置bean
//创建DispatchServlet，操作spring容器
//当创建DispatchServlet持有容器，可以进行分发映射
//onStartup是tomcat调用，把servletContext对象传入
public class init implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("start up----");
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //注册，加入到容器类中
        ac.register(Config.class);
        //完成bean的创建和配置
        ac.refresh();
        //创建DispatchServlet
        //ac是容器
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
        //返回ServletRegistration.Dynamic
        ServletRegistration.Dynamic registration = servletContext.addServlet("app", dispatcherServlet);
        //tomcat启动时候，加载dispatcherServlet
        registration.setLoadOnStartup(1);

        //设置/
        registration.addMapping("/");
    }
}
