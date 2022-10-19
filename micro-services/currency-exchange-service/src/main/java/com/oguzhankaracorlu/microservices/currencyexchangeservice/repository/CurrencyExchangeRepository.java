package com.oguzhankaracorlu.microservices.currencyexchangeservice.repository;

import com.oguzhankaracorlu.microservices.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author oguzhan.karacorlu on 19.10.2022
 * @project currency-exchange-service
 */
@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findBySourceAndTarget(String from, String to);
}
