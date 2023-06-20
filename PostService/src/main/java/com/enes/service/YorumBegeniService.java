package com.enes.service;

import com.enes.repository.IYorumBegeniRepository;
import com.enes.repository.entity.YorumBegeni;
import com.enes.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class YorumBegeniService  extends ServiceManager<YorumBegeni,String> {
    private final IYorumBegeniRepository repository;
    public YorumBegeniService(IYorumBegeniRepository repository){
        super(repository);
        this.repository=repository;
    }
}
