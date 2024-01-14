package com.blog.Blog.controllers;

import com.blog.Blog.models.Post;
import com.blog.Blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BlogController {
    @Autowired //для переменно, которая ссылается на репозиторий
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blog(ModelAndView model) { //рекомендуется ModelAndView, а не Model
        Iterable<Post> posts = postRepository.findAll();
        model.addObject("posts", posts);
        return "blog";
    }
}
