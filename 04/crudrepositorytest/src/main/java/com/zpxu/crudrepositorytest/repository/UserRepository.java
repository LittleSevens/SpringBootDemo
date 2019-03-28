package com.zpxu.crudrepositorytest.repository;

import com.zpxu.crudrepositorytest.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
