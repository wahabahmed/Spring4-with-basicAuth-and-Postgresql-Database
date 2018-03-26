package com.automaticamusements.app.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wahaba on 23/01/2018.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
