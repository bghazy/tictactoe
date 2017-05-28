package bghazy.tictactoe

import bghazy.tictactoe.model._


object Main extends App {

  val game = new TicTacToe(
    new HumanTicTacPlayer(),
    new MinMaxStrategyFinder[TicTacToeState]())

  game.play

}