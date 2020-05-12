package com.example.pokemongoget.domain.model.get.option;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ThrowMethod implements GetOption {
    normal(0), curves(100);

    int point;

    @Override
    public int point() {
        return point;
    }
}
