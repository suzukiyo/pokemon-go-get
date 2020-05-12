package com.example.pokemongoget.presentation.controller

import com.example.pokemongoget.TestApplication
import com.example.pokemongoget.domain.model.get.option.ArtisticPoint
import com.example.pokemongoget.domain.model.get.option.ChallengeTime
import com.example.pokemongoget.domain.model.get.option.ThrowMethod
import com.example.pokemongoget.domain.model.get.useitem.UseItem
import com.example.pokemongoget.domain.model.item.TreeNuts
import com.example.pokemongoget.domain.model.item.ball.MonsterBall
import com.example.pokemongoget.domain.model.monster.CombatPower
import com.example.pokemongoget.domain.model.monster.Monster
import com.example.pokemongoget.domain.model.monster.MonsterNumber
import com.example.pokemongoget.domain.model.monster.MonsterType
import com.example.pokemongoget.domain.model.monster.ability.DefensePower
import com.example.pokemongoget.domain.model.monster.ability.HitPoint
import com.example.pokemongoget.domain.model.monster.ability.MonsterAbility
import com.example.pokemongoget.domain.model.monster.ability.OffensivePower
import com.example.pokemongoget.domain.model.monster.basic.Gender
import com.example.pokemongoget.domain.model.monster.basic.Height
import com.example.pokemongoget.domain.model.monster.basic.MonsterBasic
import com.example.pokemongoget.domain.model.monster.basic.Weight
import com.example.pokemongoget.presentation.viewmodel.MonsterGetChallengeRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = TestApplication, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient(timeout = "10000")
class PokemonGetChallengeControllerTest extends Specification {

    @Autowired
    PokemonGetChallengeController pokemonGetChallengeController

    def "ポケモンをGetする"() {
        setup:
        def monster = new Monster(
                new CombatPower(3200),
                new MonsterAbility(new OffensivePower(120), new DefensePower(200), new HitPoint(85)),
                MonsterType.normal,
                new MonsterBasic(Gender.male, new Weight(60), new Height(170)),
                new MonsterNumber(123))

        def monsterGetChallengeRequest = new MonsterGetChallengeRequest(
                monster,
                new UseItem(ball, treeNuts),
                artisticPoint,
                throwMethod,
                challengeTime)

        when:
        def monsterGetChallengeResponse = pokemonGetChallengeController.get(monsterGetChallengeRequest)
        System.out.println(monsterGetChallengeResponse.toString())

        then:
        noExceptionThrown()

        where:
        ball                    || treeNuts      || artisticPoint      || throwMethod        || challengeTime
        MonsterBall.monsterBall || TreeNuts.zuri || ArtisticPoint.nice || ThrowMethod.curves || ChallengeTime.one
        MonsterBall.superBall || TreeNuts.zuri || ArtisticPoint.great || ThrowMethod.normal || ChallengeTime.other
        MonsterBall.hyperBall || TreeNuts.silver || ArtisticPoint.nice || ThrowMethod.curves || ChallengeTime.one
    }

}
