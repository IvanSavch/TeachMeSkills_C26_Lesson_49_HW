package by.tms.hw.dao;

import by.tms.hw.entity.Operation;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class HibernateOperationDao implements OperationDao{
    @Autowired
    private SessionFactory factory;
    @Override
    public void save(Operation operation) {
        factory.getCurrentSession().save(operation);
    }
}
