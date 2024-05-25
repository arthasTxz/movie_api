package com.yabeto.movies.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yabeto.movies.entities.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{

}
