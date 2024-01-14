package com.blog.Blog.repo;

import com.blog.Blog.models.Post;
import org.springframework.data.repository.CrudRepository;
//интерфейс для базовых действий с таблицей (добавление, удаление и тд)

public interface PostRepository extends CrudRepository<Post, Long> {
}
