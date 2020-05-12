package com.example.pokemongoget.domain.model.item.ball;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum MonsterBall {
    monsterBall(MonsterBallRate.normal),
    superBall(MonsterBallRate.littleUp),
    hyperBall(MonsterBallRate.highUp);

    MonsterBallRate rate;

    public Integer rate() {
        return rate.value;
    }
}
