package com.anahitapp.anahit.Definition;

import com.anahitapp.anahit.Subject.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DefinitionRepository extends JpaRepository<Definition, UUID> {
}
