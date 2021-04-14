package com.tomas.service;

import com.tomas.model.Speaker;
import com.tomas.repository.HibernateSpeakerRepositoryImpl;
import com.tomas.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
