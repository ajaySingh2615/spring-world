package com.social.media.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.social.media.model.SocialUser;

public interface SocialUserRepository extends JpaRepository<SocialUser, Long> {

}
