package com.enes.service;

import com.enes.repository.IPostResimPoszisyonRepository;
import com.enes.repository.entity.PostResimPozisyon;
import com.enes.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PostResimPoszisyonService  extends ServiceManager<PostResimPozisyon,String> {
    private final IPostResimPoszisyonRepository repository;

    public PostResimPoszisyonService(IPostResimPoszisyonRepository repository){
        super(repository);
        this.repository=repository;
    }
}
