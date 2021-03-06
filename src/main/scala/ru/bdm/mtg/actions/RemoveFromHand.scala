package ru.bdm.mtg.actions
import ru.bdm.mtg.AllSet.AllSetOps
import ru.bdm.mtg.{Card, State}

case class RemoveFromHand(card:Card) extends Action {
  override def act(state: State): Seq[State] =
    Seq(state.copy(hand = state.hand -~ card))
}
