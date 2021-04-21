package com.alextherapeutics.sampleapi.controller;

import com.alextherapeutics.sampleapi.model.AppUser;
import com.alextherapeutics.sampleapi.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST entrypoint for app user endpoints
 */
@RestController
@RequestMapping("user")
@ResponseBody
@RequiredArgsConstructor
public class AppUserController {
    private final AppUserService appUserService;

    /**
     * Get a user entity
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public ResponseEntity<?> getUser(@PathVariable long id) {
        var user = appUserService.findUser(id);
        if (user.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    /**
     * Create a user entity
     * @param user
     * @return
     */
    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody AppUser user) {
        var created = appUserService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}
