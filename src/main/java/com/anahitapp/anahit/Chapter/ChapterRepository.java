package com.anahitapp.anahit.Chapter;

import com.anahitapp.anahit.Definition.Definition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChapterRepository extends JpaRepository<Chapter, UUID> {
}
