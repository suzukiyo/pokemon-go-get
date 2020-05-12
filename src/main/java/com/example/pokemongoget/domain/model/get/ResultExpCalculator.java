package com.example.pokemongoget.domain.model.get;

import com.example.pokemongoget.domain.model.get.option.ArtisticPoint;
import com.example.pokemongoget.domain.model.get.option.ChallengeTime;
import com.example.pokemongoget.domain.model.get.option.ThrowMethod;
import com.example.pokemongoget.domain.model.monster.Monster;
import com.example.pokemongoget.presentation.viewmodel.MonsterGetChallengeRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResultExpCalculator {
    Result result;

    Monster monster;
    ArtisticPoint artisticPoint;
    ThrowMethod throwMethod;
    ChallengeTime challengeTime;

    public ResultExperienceList calculate() {
        return new ResultExperienceList(artisticPoint, throwMethod, challengeTime);
    }

    public static ResultExpCalculator create(Result result, MonsterGetChallengeRequest request) {
        return new ResultExpCalculator(result,
                request.getMonster(),
                request.getArtisticPoint(),
                request.getThrowMethod(),
                request.getChallengeTime());
    }
}
