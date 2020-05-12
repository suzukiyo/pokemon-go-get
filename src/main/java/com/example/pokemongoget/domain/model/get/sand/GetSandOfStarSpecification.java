package com.example.pokemongoget.domain.model.get.sand;

import com.example.pokemongoget.domain.model.monster.CombatPower;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetSandOfStarSpecification {
    GetSandOfStar getSandOfStar;

    CombatPower combatPower;

    public GetSandOfStar getSandOfStar() {
        int getSandOfStar = GetSandOfStar.ofDefault().getValue();
        if (combatPower.getValue() > 1000) getSandOfStar += 50;
        return new GetSandOfStar(getSandOfStar);
    }
}
