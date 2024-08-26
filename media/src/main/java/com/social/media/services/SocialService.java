package com.social.media.services;

import com.social.media.model.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {

    private final SocialUserRepository socialUserRepository;

    public SocialService(SocialUserRepository socialUser) {
        this.socialUserRepository = socialUser;
    }

    public List<SocialUser> getAllUsers(){
        return socialUserRepository.findAll();
    }

    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }
}
