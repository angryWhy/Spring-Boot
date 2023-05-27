package bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "furn01")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Furn {
    private Integer id;
    private String name;
    private Double price;
}
