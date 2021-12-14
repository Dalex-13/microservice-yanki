package com.nttdata.service;

import com.nttdata.domain.Yanki;
import com.nttdata.repository.YankiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class YankiService {

    @Autowired
    private YankiRepository repository;


    public Flux<Yanki> getYanki(){
        return repository.findAll();
    }

    public Mono<Yanki> getYankiById(String id){
        return repository.findById(id);
    }

    public Mono<Yanki> postYanki(Yanki yanki){
        return repository.save(yanki);
    }

    public Mono<Yanki> updateYanki(Yanki yanki){
        return repository.save(yanki);
    }

    public Mono<Void> deleteYanki(String id){
        return repository.deleteById(id);
    }






}
