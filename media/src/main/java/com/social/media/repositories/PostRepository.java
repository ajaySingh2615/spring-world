package com.social.media.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.social.media.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
