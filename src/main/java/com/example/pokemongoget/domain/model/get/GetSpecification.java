package com.example.pokemongoget.domain.model.get;

import com.example.pokemongoget.domain.model.item.ball.MonsterBall;
import com.example.pokemongoget.domain.model.monster.Monster;
import com.example.pokemongoget.presentation.viewmodel.MonsterGetChallengeRequest;
import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public class GetSpecification {
    Monster monster;
    MonsterBall monsterBall;

    public static GetSpecification create(MonsterGetChallengeRequest request) {
        return new GetSpecification(request.getMonster(), request.getUseItem().getBall());
    }

    // TODO: temporary code
    public Result getResult() {
        int level = (monster.getCombatPower().getValue() / 100) * 3;
        int numbers = (100 + monsterBall.rate() - level);

        if (new Random().nextInt(100) <= numbers) return Result.get;
        return Result.escape;
    }
}
