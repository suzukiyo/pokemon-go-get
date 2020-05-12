package com.example.pokemongoget.domain.model.item.ball;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum MonsterBallRate {
    normal(1), littleUp(5), highUp(10);

    int value;

}
