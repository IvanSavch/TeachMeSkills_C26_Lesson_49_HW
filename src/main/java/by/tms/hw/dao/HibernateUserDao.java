package by.tms.hw.dao;

import by.tms.hw.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
@Repository
public class HibernateUserDao implements UserDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
    @Override
    public User findById(Long id){
        Query<User> query = sessionFactory.getCurrentSession().createQuery("from User where id = :id", User.class);
        query.setParameter("id",id);
        User user = query.getSingleResult();
        return user;
    }
}
