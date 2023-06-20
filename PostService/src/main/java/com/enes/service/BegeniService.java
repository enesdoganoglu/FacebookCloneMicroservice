package com.enes.service;

import com.enes.repository.IBegeniRepository;
import com.enes.utility.ServiceManager;
import com.enes.repository.entity.Begeni;
import org.springframework.stereotype.Service;

@Service
public class BegeniService extends ServiceManager<Begeni,String> {
    private final IBegeniRepository repository;
    public BegeniService(IBegeniRepository repository){
        super(repository);
        this.repository=repository;
    }
}
