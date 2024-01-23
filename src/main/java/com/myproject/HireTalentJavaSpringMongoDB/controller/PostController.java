package com.myproject.HireTalentJavaSpringMongoDB.controller;

import com.myproject.HireTalentJavaSpringMongoDB.model.Post;
import com.myproject.HireTalentJavaSpringMongoDB.repository.PostRepository;
import com.myproject.HireTalentJavaSpringMongoDB.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @ApiIgnore
    @RequestMapping (value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping ("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }
    // posts/java
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post)
    {
        return postRepository.save(post);
    }
}
