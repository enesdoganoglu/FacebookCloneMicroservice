package com.enes.repository;

import com.enes.repository.entity.PostResimPozisyon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostResimPoszisyonRepository extends MongoRepository<PostResimPozisyon,String> {
}
