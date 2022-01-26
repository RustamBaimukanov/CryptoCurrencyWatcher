package com.example.cryptocurrencywatcher.controller;

import com.example.cryptocurrencywatcher.entity.Currency;
import com.example.cryptocurrencywatcher.service.CurrencyService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

@Controller
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @GetMapping("/currency/{id}")
    public Currency getCurrency(@PathVariable String id) throws IOException {
        URL url = new URL("https://api.coinlore.net/api/ticker/?id="+id);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        Currency currency = new ObjectMapper().readValue(url, Currency.class);
        ObjectMapper mapper = new ObjectMapper();
        return currency;
    }


}
