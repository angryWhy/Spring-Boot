package mainProject.config;

import bean.B;
import bean.Furn;
import bean.Monster;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//Import注解，可以指定注入类型的组件，默认情况下组件的名字或者id就是全路径名字
@Import(value = {B.class})
@Configuration(proxyBeanMethods = true)
//开启EnableConfigurationProperties，Furn自动注入，开启properties加入进去，不用加@Component
@EnableConfigurationProperties({Furn.class})
//表示配置类，类似xml文件，等于配置文件
//可以通过@Bean注解注入bean对象
//proxyBeanMethods = false,代表所有的方法创建的bean都是
public class BeanConfig {
    //@Bean:给容器添加组件
    //方法名字就是bean 的 id
    //Monster返回类型，就会被当作注入类型是Monster
    //new Monster(1,"哈哈哈",18)，就会放进容器里了
    @Bean(name = "monster_alias")
    public Monster monster01(){
        return new Monster(1,"哈哈哈",18);
    }
}
