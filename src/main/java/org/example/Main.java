package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Pokemonクラスのインスタンスを作成する
        Pokemon pikachu = new Pokemon("Pikachu", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");
        Pokemon squirtle = new Pokemon("Squirtle", "Water");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass");

        // Mapに格納する。keyはトレーナー名、valueはポケモンのList
        Map<String, List<Pokemon>> trainers = new HashMap<>();
        List<Pokemon> ashPokemons = new ArrayList<>();
        ashPokemons.add(pikachu);
        ashPokemons.add(charmander);
        List<Pokemon> mistyPokemons = new ArrayList<>();
        mistyPokemons.add(squirtle);
        List<Pokemon> brockPokemons = new ArrayList<>();
        brockPokemons.add(bulbasaur);
        trainers.put("ash", ashPokemons);
        trainers.put("misty", mistyPokemons);
        trainers.put("brock", brockPokemons);

        // Scannerでtrainer名を入力させる
        // 入力されたtrainer名に対応するポケモンのListを取得する
        // そのListの要素をfor文で標準出力する
        // なお、ash、Ashは同じtrainerとして扱う
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter trainer name: ");
        String trainerName = scanner.nextLine();
        // trainerがいない場合にTrainerNotFoundExceptionをthrowして処理を終了する
        if (!trainers.containsKey(trainerName.toLowerCase())) {
            throw new TrainerNotFoundException("Trainer not found");
        }
        List<Pokemon> pokemons = trainers.get(trainerName);
        for (Pokemon pokemon : pokemons) {
            System.out.println("Pokemon's name and type: " + pokemon.getName() + ", " + pokemon.getType());
        }

    }
}
