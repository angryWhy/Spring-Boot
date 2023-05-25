package mainProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//可以获取到-beans.xml 中配置bean
@ImportResource(locations = "classpath:beans.xml")
public class BeanConfig3 {
}
