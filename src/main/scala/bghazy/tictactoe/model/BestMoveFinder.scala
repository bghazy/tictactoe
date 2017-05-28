package bghazy.tictactoe.model

trait BestMoveFinder[S <: State[S]] {
  def move(s: S): S
}