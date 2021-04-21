package com.alextherapeutics.sampleapi.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Extend this class with your entity to get automatic ID generation
 */
@MappedSuperclass
@Data
public abstract class BasicEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long ID;
}
