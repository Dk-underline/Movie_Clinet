package com.fullstack.mioveApi.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.mioveApi.entity.Reviwe;

@Repository
public interface ReviweRepo extends MongoRepository<Reviwe, ObjectId> {

}
