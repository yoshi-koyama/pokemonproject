# PokemonMap

## 概要

ポケモンを題材にして、Mapと例外を学ぶためのプロジェクトです。

## 使い方

### 1. プロジェクトをクローンする

```
git clone git@github.com:yoshi-koyama/pokemonproject.git
```

### 2. プロジェクトを開く

IntelliJを使ってプロジェクトを開いてください。

### 3. プログラムを実行する

`Main.java`を実行してください。

## 動作確認結果

プログラムを実行し、Ashを入力。  
Ashの手持ちポケモンが標準出力される。

<img width="398" alt="スクリーンショット 2023-08-06 14 08 19" src="https://github.com/yoshi-koyama/pokemonproject/assets/62045457/86edbccf-8d7b-43e5-a65f-d8de5d5d83cf">

プログラムを実行し、ashを入力。  
Ashの手持ちポケモンが標準出力される。

<img width="376" alt="スクリーンショット 2023-08-06 12 49 22" src="https://github.com/yoshi-koyama/pokemonproject/assets/62045457/17cff86d-b8f7-4abf-a698-65af11842960">

プログラムを実行し、存在しないトレーナー名（Bob）を入力。  
TrainerNotFoundExceptionがthrowされ、Trainer not foundがメッセージとして標準出力される。  
また、Main.javaの35行目で例外がthrowされたということもわかる。  
<img width="912" alt="スクリーンショット 2023-08-06 12 47 53" src="https://github.com/yoshi-koyama/pokemonproject/assets/62045457/b39ff9fb-80e0-431b-ba92-e3a468882a4d">
