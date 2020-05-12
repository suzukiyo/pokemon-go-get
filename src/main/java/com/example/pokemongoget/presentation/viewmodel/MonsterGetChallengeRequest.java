package com.example.pokemongoget.presentation.viewmodel;

import com.example.pokemongoget.domain.model.get.option.ArtisticPoint;
import com.example.pokemongoget.domain.model.get.option.ChallengeTime;
import com.example.pokemongoget.domain.model.get.option.ThrowMethod;
import com.example.pokemongoget.domain.model.get.useitem.UseItem;
import com.example.pokemongoget.domain.model.monster.Monster;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MonsterGetChallengeRequest {
    Monster monster;
    UseItem useItem;

    ArtisticPoint artisticPoint;
    ThrowMethod throwMethod;
    ChallengeTime challengeTime;
}
