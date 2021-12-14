package com.nttdata.repository;

import com.nttdata.domain.Yanki;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YankiRepository extends ReactiveCrudRepository<Yanki, String> {
}
