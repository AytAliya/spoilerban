package com.spoilerban.spoilerban.controllers;

import com.spoilerban.spoilerban.model.Spoiler;
import com.spoilerban.spoilerban.repository.SpoilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spoiler")
public class SpoilerController {

    @Autowired
    private SpoilerRepository repository;

    @PostMapping("/saveSpoiler")
    public int saveCustomer(@RequestBody List<Spoiler> spoilers) {
        repository.saveAll(spoilers);
        return spoilers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Spoiler> findAllSpoilers() {
        return repository.findAll();
    }

    @GetMapping("/findByFName/{spoiler}")
    public List<Spoiler> findBySpoiler(@PathVariable String spoiler) {
        return repository.findBySpoilerWord(spoiler);
    }

}
