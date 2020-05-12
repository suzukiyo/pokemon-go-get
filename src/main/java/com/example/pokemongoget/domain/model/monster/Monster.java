package com.example.pokemongoget.domain.model.monster;

import com.example.pokemongoget.domain.model.monster.ability.MonsterAbility;
import com.example.pokemongoget.domain.model.monster.basic.MonsterBasic;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Monster {
    CombatPower combatPower;
    MonsterAbility monsterAbility;

    MonsterType monsterType;
    MonsterBasic monsterBasic;

    MonsterNumber monsterNumber;
}
