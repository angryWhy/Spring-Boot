package SpringBootContext;

import SpringBootContext.bean.Monster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan(value = "SpringBootContext")
@Configuration
public class Config {
    //注入Monster对象到容器
    @Bean
    public Monster getMonster(){
        return new Monster();
    }
}
