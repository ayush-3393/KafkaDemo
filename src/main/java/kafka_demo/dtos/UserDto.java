package kafka_demo.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
}
