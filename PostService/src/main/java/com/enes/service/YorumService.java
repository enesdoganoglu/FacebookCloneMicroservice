package com.enes.service;

import com.enes.repository.IYorumRepository;
import com.enes.utility.ServiceManager;
import com.enes.repository.entity.Yorum;
import org.springframework.stereotype.Service;

@Service
public class YorumService  extends ServiceManager<Yorum,String> {
    private final IYorumRepository repository;

    public YorumService(IYorumRepository repository){
        super(repository);
        this.repository=repository;
    }
}
