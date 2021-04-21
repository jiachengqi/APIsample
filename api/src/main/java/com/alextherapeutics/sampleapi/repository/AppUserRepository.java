package com.alextherapeutics.sampleapi.repository;

import com.alextherapeutics.sampleapi.model.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * CRUD operations for the AppUser entity
 */
public interface AppUserRepository extends PagingAndSortingRepository<AppUser, Long> {
}
