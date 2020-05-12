package com.example.pokemongoget.domain.model.get.option;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ArtisticPoint implements GetOption {
    excellent(100), great(50), nice(10), none(0);

    int point;

    @Override
    public int point() {
        return point;
    }
}
