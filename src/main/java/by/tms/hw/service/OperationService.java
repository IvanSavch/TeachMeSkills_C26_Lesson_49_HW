package by.tms.hw.service;

import by.tms.hw.dto.OperationDto;

public class OperationService {
    public static void operation(OperationDto operationDto) {
        switch (operationDto.getType()) {
            case "sum":
                operationDto.setResult(operationDto.getNum1() + operationDto.getNum2());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operationDto.getType());
        }
    }
}
