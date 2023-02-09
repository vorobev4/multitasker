package com.vorobev4.back.Repository;

import com.vorobev4.back.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
