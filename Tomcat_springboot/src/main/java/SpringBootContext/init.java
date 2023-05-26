package SpringBootContext;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//创建spring配置容器
//加载spring容器，按照朱姐的方式
//完成spring的配置注入，配置bean
//创建DispatchServlet，操作spring容器
//当创建DispatchServlet持有容器，可以进行分发映射
//onStartup是tomcat调用，把servletContext对象传入
public class init implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}
