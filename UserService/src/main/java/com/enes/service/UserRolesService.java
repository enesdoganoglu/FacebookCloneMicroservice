package com.enes.service;

import com.enes.repository.IUserRolesRepository;
import com.enes.repository.entity.UserRoles;
import com.enes.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserRolesService extends ServiceManager<UserRoles,String> {
    private final IUserRolesRepository repository;
    public UserRolesService(IUserRolesRepository repository){
        super(repository);
        this.repository=repository;
    }

}
