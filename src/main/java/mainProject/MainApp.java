package mainProject;

import bean.Furn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//表示这是一个springboot的应用
//scanBasePackages,代表我要扫描的包，默认扫描的是MainApp所在的包

@SpringBootApplication()
public class MainApp {
    //传统注解方式就可以使用
    public static void main(String[] args) {
        //启动springboot项目
        //ioc就是个容器
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class);
        Object furn01 = ioc.getBean(Furn.class);
        System.out.println(furn01);
    }
//    @Bean
//    public TomcatServletWebServerFactory servletContainer(){
//        return new TomcatServletWebServerFactory(8022) ;
//    }
}
