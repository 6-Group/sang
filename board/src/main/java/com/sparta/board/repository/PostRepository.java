package com.sparta.board.repository;

import com.sparta.board.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllPostByOrderByCreatedAtDesc();
    // List<Article> findAllByOrderByCreatedAtDesc();
    Optional<Post> findByIdAndPassword(Long id, String password);
    Boolean existsByIdAndPassword(Long id, String password);

}