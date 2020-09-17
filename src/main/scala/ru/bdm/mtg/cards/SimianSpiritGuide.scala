package ru.bdm.mtg.cards

import ru.bdm.mtg.AllSet._
import ru.bdm.mtg.{Card, State}
import ru.bdm.mtg.AllSet._

class SimianSpiritGuide extends Card {
  override def cost: String = ""
  override def nextStates(current: State): Seq[State] = {
    Seq(current.copy(manaPool = current.manaPool +~ 'R'))
  }
}
