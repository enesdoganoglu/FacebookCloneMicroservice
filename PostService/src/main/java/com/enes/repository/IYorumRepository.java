package com.enes.repository;

import com.enes.repository.entity.Yorum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IYorumRepository extends MongoRepository<Yorum,String> {
}
