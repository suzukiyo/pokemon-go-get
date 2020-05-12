package com.example.pokemongoget.domain.model.get;

/**
 * <pre>
 * こういったステータス系は具体的命名にする。
 * 具体的命名のほうが瞬時にコード理解が可能である。
 * success,failureでもよいが変更に弱い。
 * <pre>
 */
public enum Result {
    get, escape
}
