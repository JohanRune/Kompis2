package com.example.kompis2.repositories;

import com.example.kompis2.models.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Johan Rune
 * Date: 2021-04-12
 * Time: 17:33
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public interface KompisRepository extends CrudRepository<Kompis, Long> { //Kompis, Long?
    List<Kompis> findByName(String namn);
    List<Kompis> findByMobile(String telefonnummer);
    List<Kompis> findByMobileAndName(String telefonnummer, String namn);

}
