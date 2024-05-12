package by.tms.hw.dao;

import by.tms.hw.entity.Operation;
import by.tms.hw.entity.User;

public interface UserDao {
    void save(User user);
    public User findById(Long id);
}
