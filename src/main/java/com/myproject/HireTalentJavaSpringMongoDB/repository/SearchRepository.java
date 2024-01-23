package com.myproject.HireTalentJavaSpringMongoDB.repository;

import com.myproject.HireTalentJavaSpringMongoDB.model.Post;
import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
