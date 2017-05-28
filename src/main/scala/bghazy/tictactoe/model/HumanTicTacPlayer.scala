package bghazy.tictactoe.model

import scala.io.StdIn

class HumanTicTacPlayer extends BestMoveFinder[TicTacToeState] {
  def move(s: TicTacToeState): TicTacToeState = {
    println("Input the row and the column delimited by ' ' please!")
    val (row, col) = StdIn.readf2("{0, number} {1,number}")
    val pos = Position(row.asInstanceOf[Long].toInt, col.asInstanceOf[Long].toInt)
    try {
      s.makeMove(pos)
    } catch {
      case _: Throwable => {
        println("Such move is impossible!")
        move(s)}}}
}