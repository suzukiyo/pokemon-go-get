package com.example.pokemongoget.domain.model.monster.ability;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MonsterAbility {
    OffensivePower offensivePower;
    DefensePower defensePower;
    HitPoint hitPoint;
}
