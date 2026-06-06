package com.example.SpringTP6.repositories;

import com.example.SpringTP6.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {
}
