package com.enes.repository;

import com.enes.repository.entity.KayitliPostlar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IKayitliPostlarRepository extends MongoRepository<KayitliPostlar,String> {
}
