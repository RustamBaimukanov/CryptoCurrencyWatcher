package com.example.cryptocurrencywatcher.service;

import com.example.cryptocurrencywatcher.entity.Currency;
import com.example.cryptocurrencywatcher.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public void addCurrency(Currency currency){
        currencyRepository.save(currency);
    }

    public void updateCurrency(Currency currency){
        currencyRepository.save(currency);
    }

    public Currency getCurrency(Integer id){
        return currencyRepository.getById(id);
    }

    public List<Currency> getAllCurrencies(){
        return currencyRepository.findAll();
    }
}
