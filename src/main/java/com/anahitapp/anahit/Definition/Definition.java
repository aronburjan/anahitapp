package com.anahitapp.anahit.Definition;

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
public class Definition {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter
    private UUID id;
    @Getter @Setter
    private String name;

    @Getter @Setter private Integer importance;
    @Getter @Setter private Double userKnowledge;
    @Getter @Setter private String additionalNotes;
    @Getter @Setter private Integer image;
}
