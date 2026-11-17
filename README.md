# JockeyPOW

[![Java](https://img.shields.io/badge/Java-8-ED8B00?logo=openjdk&logoColor=white)](https://www.java.com/)
[![Android](https://img.shields.io/badge/Android-API%2034-3DDC84?logo=android&logoColor=white)](https://developer.android.com/)
[![Gradle](https://img.shields.io/badge/Gradle-8.4-02303A?logo=gradle&logoColor=white)](https://gradle.org/)
[![JUnit](https://img.shields.io/badge/Testes-JUnit%204-25A162?logo=junit5&logoColor=white)](https://junit.org/junit4/)

Aplicativo Android simples de pedra, papel e tesoura, desenvolvido em Java.

## Objetivo

Este projeto demonstra fundamentos iniciais de Java, orientação a objetos e desenvolvimento Android:

- `enum` para representar escolhas e resultados;
- encapsulamento das regras do jogo;
- separação entre lógica de negócio e interface Android;
- injeção simples de `Random` para permitir testes;
- testes unitários com JUnit;
- uso de recursos Android para textos e acessibilidade;
- placar de vitórias, derrotas e empates.

## Arquitetura

- `Escolha`: representa pedra, papel e tesoura e conhece a regra de vitória.
- `Resultado`: representa vitória, derrota ou empate.
- `Jogo`: escolhe a jogada do computador e avalia o resultado.
- `MainActivity`: conecta os eventos da tela ao domínio do jogo e atualiza a interface.

## Como executar

Abra o projeto no Android Studio, sincronize o Gradle e execute o módulo `app` em um emulador ou dispositivo Android.

Para executar os testes unitários:

```text
gradlew.bat test
```

## Próximas evoluções

- permitir reiniciar o placar;
- criar testes instrumentados para a interação da tela;
- melhorar o design visual e a responsividade.
