package mainProject.config;

import mainProject.bean.C;
import mainProject.bean.Monster;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
public class BeanConfig2 {
    @Bean(name = "monster_alias2")
    public Monster monster01(){
        return new Monster(1,"嘿嘿嘿",18);
    }
    @Bean
//    @ConditionalOnBean(name="monster_alias2")
//    当容器中有一个Bean名字是monster_alias2，就注入C这个Bean，如果没有，就不注入
    //对类型不约束，只认名称
    @ConditionalOnBean(name="monster_alias2")
    //和上面反过来的方式
    @ConditionalOnMissingBean()
    public C c1(){
        return new C();
    }
}
