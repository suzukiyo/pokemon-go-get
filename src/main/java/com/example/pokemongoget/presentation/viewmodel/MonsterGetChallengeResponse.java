package com.example.pokemongoget.presentation.viewmodel;

import com.example.pokemongoget.domain.model.get.Result;
import com.example.pokemongoget.domain.model.get.ResultExperienceList;
import com.example.pokemongoget.domain.model.get.candy.GetCandySpecification;
import com.example.pokemongoget.domain.model.get.option.GetOption;
import com.example.pokemongoget.domain.model.get.sand.GetSandOfStarSpecification;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class MonsterGetChallengeResponse {
    Result result;

    Integer sand;
    Integer candy;
    Map<String, Integer> point;

    public static MonsterGetChallengeResponse createGet(Result result,
                                                     GetSandOfStarSpecification getSandOfStarSpecification,
                                                     GetCandySpecification getCandySpecification,
                                                     ResultExperienceList resultExperienceList) {
        return new MonsterGetChallengeResponse(
                result,
                getSandOfStarSpecification.getSandOfStar().getValue(),
                getCandySpecification.getCandy().getValue(),
                resultExperienceList.getValues().stream()
                        .collect(Collectors.toMap(GetOption::optionName, GetOption::point)));
    }

    public static MonsterGetChallengeResponse createEscape(Result result) {
        return new MonsterGetChallengeResponse(result, 0, 0, Map.of());
    }
}
