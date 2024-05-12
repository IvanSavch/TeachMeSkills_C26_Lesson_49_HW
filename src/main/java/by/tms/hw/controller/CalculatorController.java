package by.tms.hw.controller;

import by.tms.hw.dao.HibernateOperationDao;
import by.tms.hw.dao.OperationDao;
import by.tms.hw.dao.UserDao;
import by.tms.hw.dto.OperationDto;
import by.tms.hw.entity.Operation;
import by.tms.hw.entity.User;
import by.tms.hw.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    OperationDao dao;

    @Autowired
    UserDao userDao;

    @GetMapping
    String calculator() {
        return "calculator";
    }

    @PostMapping
    String calculator(OperationDto dto, Model model) {

        Operation operation = new Operation();

        operation.setUser(userDao.findById(dto.getIdUser()));
        operation.setType(dto.getType());
        operation.setNum1(dto.getNum1());
        operation.setNum2(dto.getNum2());
        OperationService.operation(dto);
        operation.setResult(dto.getResult());

        dao.save(operation);

        model.addAttribute("operation", operation);
        return "calculator";
    }
}
