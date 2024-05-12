package by.tms.hw.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Data
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double num1;
    private double num2;
    private String type;
    private double result;

    @ManyToOne
    private User user;
}
