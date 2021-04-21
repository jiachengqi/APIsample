package com.alextherapeutics.sampleapi.service;

import com.alextherapeutics.sampleapi.model.AppUser;
import com.alextherapeutics.sampleapi.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Logic for handling app users
 */
@Service
@RequiredArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;

    /**
     * Create a user
     * @param user
     * @return
     */
    public AppUser createUser(AppUser user) {
        return appUserRepository.save(user);
    }

    /**
     * Find a user
     * @param id
     * @return
     */
    public Optional<AppUser> findUser(long id) {
        return appUserRepository.findById(id);
    }
}
