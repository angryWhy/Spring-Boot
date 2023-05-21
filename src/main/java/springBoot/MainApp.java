package springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//表示这是一个springboot的应用
//scanBasePackages,代表我要扫描的包，默认扫描的是MainApp所在的包
@SpringBootApplication(scanBasePackages = "extra")
public class MainApp {
    public static void main(String[] args) {
        //启动springboot项目
        //ioc就是个容器
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for(String bean :beanDefinitionNames){
            System.out.println(bean);
        }
    }
}
