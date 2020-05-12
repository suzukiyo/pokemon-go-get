package com.example.pokemongoget.domain.model.get.option;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ChallengeTime implements GetOption {
    one(100), other(0);

    int point;

    @Override
    public int point() {
        return point;
    }
}
