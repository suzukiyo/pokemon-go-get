package com.example.pokemongoget.domain.model.get.useitem;

import com.example.pokemongoget.domain.model.item.TreeNuts;
import com.example.pokemongoget.domain.model.item.ball.MonsterBall;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UseItem {
    MonsterBall ball;
    TreeNuts treeNuts;
}
