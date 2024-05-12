package by.tms.hw.dto;

import by.tms.hw.entity.Operation;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String username;
    private String name;
    private String password;
    private List<Operation> operations;
}
