package com.example.cryptocurrencywatcher.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currencies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    @Id
    private Integer id;

    private String symbol;

    @Column(name = "price")
    private Double price_usd;

    public Currency(Integer id, String symbol) {
        this.id = id;
        this.symbol = symbol;
    }
}
