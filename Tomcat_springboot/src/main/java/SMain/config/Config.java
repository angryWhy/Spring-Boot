package SMain.config;

import SMain.Bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
