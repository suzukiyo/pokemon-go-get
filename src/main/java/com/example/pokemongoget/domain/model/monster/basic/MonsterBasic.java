package com.example.pokemongoget.domain.model.monster.basic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MonsterBasic {
    Gender gender;
    Weight weight;
    Height height;
}
