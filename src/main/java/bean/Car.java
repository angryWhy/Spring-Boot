package bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car {
    private String name;
    private Double price;
}
