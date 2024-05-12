package by.tms.hw.entity;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "TB_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String password;

}
