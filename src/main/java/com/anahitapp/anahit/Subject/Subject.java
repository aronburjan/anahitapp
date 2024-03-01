package com.anahitapp.anahit.Subject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@ToString
public class Subject {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter private UUID id;
    @Getter @Setter private String name;
    @Getter @Setter private String category;
    @Getter @Setter private Integer importance;
    @Getter @Setter private Double userProgress;

    @Getter @Setter private Integer image;

    public Subject(String name, String category, Integer importance)
    {
        this.name = name;
        this.category = category;
        this.importance = importance;
    }

    public Subject(String name, String category)
    {
        this.name = name;
        this.category = category;
    }
}
