package com.example.cryptocurrencywatcher.repository;

import com.example.cryptocurrencywatcher.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
