package Test;

import bean.Furn;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@SpringBootTest
public class Test {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @org.junit.jupiter.api.Test
    public void contextLoads(){
        BeanPropertyRowMapper<Furn> rowMapper = new BeanPropertyRowMapper<>(Furn.class);
        List<Furn> query = jdbcTemplate.query("SELECT * FROM `furn`", rowMapper);
        System.out.println(query);
        for(Furn furn:query){
            System.out.println(furn);
        }
    }
}
