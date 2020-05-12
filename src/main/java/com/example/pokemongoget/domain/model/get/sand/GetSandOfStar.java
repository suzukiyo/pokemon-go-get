package com.example.pokemongoget.domain.model.get.sand;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetSandOfStar {
    private static final int defaultGetSandOfStar = 100;
    int value;

    public static GetSandOfStar ofDefault() {
        return new GetSandOfStar(defaultGetSandOfStar);
    }
}
