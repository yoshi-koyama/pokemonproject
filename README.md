# PokemonMap

## 概要

ポケモンを題材にして、Mapと例外を学ぶためのプロジェクトです。

## 使い方

### 1. プロジェクトをクローンする

```
git clone
```

### 2. プロジェクトを開く

IntelliJを使ってプロジェクトを開いてください。

### 3. プログラムを実行する

`Main.java`を実行してください。

## 動作確認結果

プログラムを実行し、Ashを入力。  
Ashの手持ちポケモンが標準出力される。

<img width="378" alt="スクリーンショット 2023-08-06 12 47 06" src="https://github.com/yoshi-koyama/pokemonproject/assets/62045457/4e0617da-ccb8-4f0d-b232-8f3253f16e6d">

プログラムを実行し、Ashを入力。  
Ashの手持ちポケモンが標準出力される。

<img width="376" alt="スクリーンショット 2023-08-06 12 49 22" src="https://github.com/yoshi-koyama/pokemonproject/assets/62045457/17cff86d-b8f7-4abf-a698-65af11842960">

プログラムを実行し、存在しないトレーナー名（Bob）を入力。  
TrainerNotFoundExceptionがthrowされ、Trainer not foundがメッセージとして標準出力される。  
また、Main.javaの35行目で例外がthrowされたということもわかる。  
<img width="912" alt="スクリーンショット 2023-08-06 12 47 53" src="https://github.com/yoshi-koyama/pokemonproject/assets/62045457/b39ff9fb-80e0-431b-ba92-e3a468882a4d">
