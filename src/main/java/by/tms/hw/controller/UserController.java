package by.tms.hw.controller;

import by.tms.hw.dao.OperationDao;
import by.tms.hw.dao.UserDao;
import by.tms.hw.dto.UserDto;
import by.tms.hw.entity.Operation;
import by.tms.hw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserDao userDao;
    @GetMapping
    String create() {
        return "/user/create";
    }
    @PostMapping
    String create(UserDto dto, HttpSession session){
        User user = new User();
        user.setName(dto.getName());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        userDao.save(user);
        session.setAttribute("user",user);
        return "redirect:/calculator";
    }
}
