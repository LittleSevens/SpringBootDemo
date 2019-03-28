package com.zpxu.crudrepositorytest.service;

import com.zpxu.crudrepositorytest.bean.User;
import com.zpxu.crudrepositorytest.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }

    @Transactional
    public void delete(int id){
        userRepository.deleteById(id);
    }

    public Iterable<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(Integer id){
        Optional<User> op = userRepository.findById(id);
        return op.get();
    }

    public void update(User user){
        user.setUsername("徐召朋");
        user.setLoginname("xzp");
        userRepository.save(user);
    }
}
