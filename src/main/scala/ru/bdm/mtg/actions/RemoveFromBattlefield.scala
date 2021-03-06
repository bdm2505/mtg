package ru.bdm.mtg.actions

import ru.bdm.mtg.AllSet.AllSetOps
import ru.bdm.mtg.lands.Permanent
import ru.bdm.mtg.{Card, State}

case class RemoveFromBattlefield(card:Permanent) extends Action{
  override def act(state: State): Seq[State] =
    Seq(state.copy(battlefield = state.battlefield -~ card))
}
