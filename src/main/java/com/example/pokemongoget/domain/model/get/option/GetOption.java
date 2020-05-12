package com.example.pokemongoget.domain.model.get.option;

public interface GetOption {
    default String optionName() {
        return this.getClass().getSimpleName();
    }

    int point();
}
