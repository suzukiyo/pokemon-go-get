package com.example.pokemongoget.domain.model.get.candy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetCandy {
    private static final int defaultGetCandy = 3;
    int value;

    public static GetCandy ofDefault() {
        return new GetCandy(defaultGetCandy);
    }
}
