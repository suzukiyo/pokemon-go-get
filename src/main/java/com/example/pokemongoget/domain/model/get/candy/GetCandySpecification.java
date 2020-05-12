package com.example.pokemongoget.domain.model.get.candy;

import com.example.pokemongoget.domain.model.item.TreeNuts;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCandySpecification {
    GetCandy getCandy;
    TreeNuts treeNuts;

    public GetCandy getCandy() {
        if (treeNuts == TreeNuts.pain) return new GetCandy(getCandy.getValue() * 2);
        if (treeNuts == TreeNuts.silver) return new GetCandy(getCandy.getValue() * 2);
        return getCandy;
    }
}
