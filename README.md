# Desafio - Controle de Fluxo

Neste desafio de projeto, vamos explorar alguns cenários com fluxos condicionais, repetições e excepcionais. A fim de exercitar todo o conteúdo ministrado nas aulas implementando um pequeno sistema contador.

> Importante frisar que ainda sou relativamente iniciante em Java, tendo apenas conhecimento em linguagem C que ainda está sendo ensinada nesse semestre da faculdade. Dito isso, aceito qualquer tipo de sugestão para melhorias que me farão aprender ainda mais sobre essa complexa linguagem.

## Conteúdo do código

Aqui estão listados alguns dos conteúdos aprendidos durante o módulo de Java Básico da [DIO](www.dio.me), ministrado pelo professor [Gleyson Sampaio](https://github.com/glysns).

- `Condicionais`: um bloco do código será executado se uma certa condição for validada;
- `Escopos`: trabalha com os conceitos de escopos globais e locais;
- `Repetições`: a fim de usar o contador, um laço FOR é utilizado;
- `Scanner`: utiliza a classe Scanner para entrada de dados do usuário;
- `Exceções`: o código trabalhará execeções customizadas;
- `Métodos`: utiliza a criação e invocação de métodos criados para rodar a instrução do código.

## Intuito do projeto

O sistema deverá receber dois parâmetros via terminal (Scanner) que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) com a subtração do segundo número pelo primeiro e realizar no console a contagem crescente (System.out.print) dos números.
Mas tem um porém, a fim de utilizar as exceções personalizadas, a contagem dos números só será executada caso a condição `primeiroNumero < segundoNumero` for atendida. Caso não seja, a execeção `ParametrosInvalidosException` será lançada e retornará a mensagem orientando ao usuário que a condição acima seja seguida.
