package mainProject;

import mainProject.MyServlet.MyListener;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;
import java.util.Arrays;

@Configuration(proxyBeanMethods = true)
public class RegisterConfig {
    //注入servlet，以ben方式注入
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        WebMvcProperties.Servlet servlet = new WebMvcProperties.Servlet();
        return new ServletRegistrationBean((Servlet) servlet,"/servlet01","/servlet02");
    }

    //注入Filter
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        //原生Filter
        Filter filter = new Filter() {
            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

            }
        };
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>(filter);
        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/resource/*","/css/*"));
        return filterFilterRegistrationBean;
    }

    //注入listener
    @Bean
    public ServletListenerRegistrationBean listenerRegistrationBean(){
        MyListener myListener = new MyListener();
        return new ServletListenerRegistrationBean<>(myListener);
    }
}
