package com.enes.repository;

import com.enes.repository.entity.UserRoles;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRolesRepository extends MongoRepository<UserRoles,String> {
    List<UserRoles> findAllByUserprofileid(String userprofileid);
}
