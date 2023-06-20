package com.enes.service;

import com.enes.repository.IKayitliPostlarRepository;
import com.enes.utility.ServiceManager;
import com.enes.repository.entity.KayitliPostlar;
import org.springframework.stereotype.Service;

@Service
public class KayitliPostlarService extends ServiceManager<KayitliPostlar,String> {
    private final IKayitliPostlarRepository repository;

    public KayitliPostlarService(IKayitliPostlarRepository repository){
        super(repository);
        this.repository=repository;
    }
}
