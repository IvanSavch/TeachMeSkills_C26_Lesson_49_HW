package by.tms.hw.dto;

import by.tms.hw.entity.User;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class OperationDto {
    private double num1;
    private double num2;
    private String type;
    private double result;
    private Long idUser;
}
