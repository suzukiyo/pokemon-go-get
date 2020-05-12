package com.example.pokemongoget.presentation.controller;

import com.example.pokemongoget.domain.model.get.GetSpecification;
import com.example.pokemongoget.domain.model.get.Result;
import com.example.pokemongoget.domain.model.get.ResultExpCalculator;
import com.example.pokemongoget.domain.model.get.ResultExperienceList;
import com.example.pokemongoget.domain.model.get.candy.GetCandy;
import com.example.pokemongoget.domain.model.get.candy.GetCandySpecification;
import com.example.pokemongoget.domain.model.get.sand.GetSandOfStar;
import com.example.pokemongoget.domain.model.get.sand.GetSandOfStarSpecification;
import com.example.pokemongoget.presentation.viewmodel.MonsterGetChallengeRequest;
import com.example.pokemongoget.presentation.viewmodel.MonsterGetChallengeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
class PokemonGetChallengeController {

    @PostMapping
    MonsterGetChallengeResponse get(@RequestBody MonsterGetChallengeRequest request) {

        GetSpecification getSpecification = GetSpecification.create(request);
        Result result = getSpecification.getResult();
        if(result == Result.escape) return MonsterGetChallengeResponse.createEscape(result);

        GetCandySpecification getCandySpecification = new GetCandySpecification(
                GetCandy.ofDefault(), request.getUseItem().getTreeNuts());

        GetSandOfStarSpecification getSandOfStarSpecification = new GetSandOfStarSpecification(
                GetSandOfStar.ofDefault(), request.getMonster().getCombatPower());

        ResultExpCalculator resultExpCalculator = ResultExpCalculator.create(result, request);
        ResultExperienceList resultExperienceList = resultExpCalculator.calculate();

        return MonsterGetChallengeResponse.createGet(result,
                getSandOfStarSpecification,
                getCandySpecification,
                resultExperienceList);
    }
}
