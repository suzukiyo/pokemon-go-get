package com.example.pokemongoget.domain.model.get;

import com.example.pokemongoget.domain.model.get.option.GetOption;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class ResultExperienceList {
    List<GetOption> values;

    ResultExperienceList(GetOption ... values) {
        this.values = Arrays.asList(values);
    }
}
