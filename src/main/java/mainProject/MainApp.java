package mainProject;

import mainProject.bean.B;
import mainProject.bean.Monster;
import mainProject.config.BeanConfig;
import mainProject.config.BeanConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//表示这是一个springboot的应用
//scanBasePackages,代表我要扫描的包，默认扫描的是MainApp所在的包

@SpringBootApplication()
public class MainApp {
    //传统注解方式就可以使用
    public static void main(String[] args) {
        //启动springboot项目
        //ioc就是个容器
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class);
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object monster = classPathXmlApplicationContext.getBean("monster");
        BeanConfig bean = ioc.getBean(BeanConfig.class);
        BeanConfig2 bean1 = ioc.getBean(BeanConfig2.class);
        Monster monster1 = bean.monster01();
        Monster monster3 = bean1.monster01();
        Monster monster2 = bean.monster01();
        B bean2 = ioc.getBean(B.class);
        Object c1 = ioc.getBean("c1");
        Object monster_alias = ioc.getBean("monster_alias");
        System.out.println(monster1.hashCode()+"-"+monster2.hashCode()+"-"+monster_alias.hashCode()+"-"+monster3.hashCode()+"-"+c1);
//        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
//        for(String bean :beanDefinitionNames){
//            System.out.println(bean);
//        }
    }
//    @Bean
//    public TomcatServletWebServerFactory servletContainer(){
//        return new TomcatServletWebServerFactory(8022) ;
//    }
}
