package mainProject.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DruidDataSourceConfig {
    //编写方法，注入DruidDataSource
    @Bean
//    ConfigurationProperties("spring.datasource")配置，就不需要druid的setXXX方法
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        //加入监控功能
        try {
            druidDataSource.setFilters("stat,wall");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return druidDataSource;
    }
    @Bean
    //Druid监控功能
    public ServletRegistrationBean statViewServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> statViewServletServletRegistrationBean = new ServletRegistrationBean<>(statViewServlet);
        statViewServletServletRegistrationBean.addInitParameter("root","root");
        statViewServletServletRegistrationBean.addInitParameter("password","PO1!pVRNJp4i");
        return statViewServletServletRegistrationBean;
    }

    @Bean
    //Druid的web监控功能
    public FilterRegistrationBean webStatFilter(){
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
        //设置的url
        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        //排除的url
        filterFilterRegistrationBean.addInitParameter("exclusions","*.js");
        return filterFilterRegistrationBean;
    }
}
