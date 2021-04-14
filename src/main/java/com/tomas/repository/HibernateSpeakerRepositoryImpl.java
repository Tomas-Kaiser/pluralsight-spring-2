package com.tomas.repository;

import com.tomas.model.Speaker;

import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = List.of(
                new Speaker("Tomas", "Kai"),
                new Speaker("Peter", "Kos")
        );

        return speakers;
    }
}
