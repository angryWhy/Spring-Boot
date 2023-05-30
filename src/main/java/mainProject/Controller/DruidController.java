package mainProject.Controller;

import bean.Furn;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DruidController {
    @Resource
    public JdbcTemplate jdbcTemplate;
    public List<Furn> get(){
        BeanPropertyRowMapper<Furn> rowMapper = new BeanPropertyRowMapper<>();
        List<Furn> query = jdbcTemplate.query("select * from furn", rowMapper);
        System.out.println(query);
        return query;
    }
}
