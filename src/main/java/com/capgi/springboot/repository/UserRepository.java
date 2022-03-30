package com.capgi.springboot.repository;

import org.springframework.stereotype.Repository;
import com.capgi.springboot.entities.UserRecord;
import org.springframework.data.repository.*;


@Repository
public interface UserRepository extends CrudRepository<UserRecord, String>{

}
