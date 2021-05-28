package com.github.MarcelSousa.citiesapi.countries.repository;

import com.github.MarcelSousa.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoutryRepository extends JpaRepository<Country, Long> {
}
