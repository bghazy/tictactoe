package bghazy.tictactoe.model

trait State[S <: State[S]] {
  def isGameOver      : Boolean
  def playerOneWin    : Boolean
  def playerTwoWin    : Boolean
  def isPlayerOneTurn : Boolean
  def generateStates  : Seq[S]
}