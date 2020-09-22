package ru.bdm.mtg.cards

import ru.bdm.mtg.Card
import ru.bdm.mtg.actions.{Action, AddBattlefield, AddDiscard, AddGraveyard, DiscardCard, RemoveFromBattlefield, RemoveFromHandAndMana, TakeCards}
import ru.bdm.mtg.conditions.{Condition, Discard, IsBattlefield, IsPlay, IsPlayFromHandAndMana}

class InsolentNeonate extends Card{
  val cost = "R"

  override val description: Map[Condition, Action] = Map(
    IsPlayFromHandAndMana(this, cost) -> RemoveFromHandAndMana(this, cost) * AddBattlefield(this),
    (IsPlay and IsBattlefield(this)) -> TakeCards(1) * AddDiscard(1) * AddGraveyard(this) * RemoveFromBattlefield(this),
    Discard(this) -> DiscardCard(this) * AddGraveyard(this),
  )
}
