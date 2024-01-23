package com.myproject.HireTalentJavaSpringMongoDB.repository;

import com.myproject.HireTalentJavaSpringMongoDB.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>{

}
