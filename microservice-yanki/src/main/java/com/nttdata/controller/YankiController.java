package com.nttdata.controller;

import com.nttdata.domain.Yanki;
import com.nttdata.service.YankiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/yanki")
//@RequiredArgsConstructor
public class YankiController {

    @Autowired
    private YankiService yankiService;

    @GetMapping
    public Flux<Yanki> getYanki(){
        log.info("listado de todos los yanki");
        return yankiService.getYanki();
    }

    @GetMapping("/{id}")
    public Mono<Yanki> getYankiById(@PathVariable String id){
        log.info("listado por ID");
        return yankiService.getYankiById(id);
    }

    @PostMapping("/add")
    public Mono<Yanki> putYanki( @RequestBody Yanki yanki){
        log.info("creación de yanki");
        return yankiService.postYanki(yanki);
    }

    @PutMapping("/{id}")
    public Mono<Yanki> updateYanki(@RequestBody Yanki yanki){
        log.info("Actualizar por Id");
        return yankiService.updateYanki(yanki);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteYanki(@PathVariable String id){
        return yankiService.deleteYanki(id);
    }



}
