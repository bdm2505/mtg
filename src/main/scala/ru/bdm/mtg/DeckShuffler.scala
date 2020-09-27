package ru.bdm.mtg

import ru.bdm.mtg.AllSet.AllSetOps
import ru.bdm.mtg.cards._
import ru.bdm.mtg.lands.{CrumblingVestige, Mountain, ThrivingBluff}

import scala.util.Random

case class DeckShuffler(seed:Long) {

  val random = new Random(seed)

  def shuffle(desk: Seq[Card]): Seq[Card] = {
    val array = Array.fill[Card](desk.length)(null)
    var i = 0
    desk.filter{ card =>
      val index = random.nextInt(desk.length)
      if(array(index) == null){
        array(index) = card
        false
      } else true
    } foreach { card =>
      while (array(i) != null)
        i += 1
      array(i) = card
    }
    array
  }
}

object DeckShuffler {
  val allCard: AllSet.Type[Card] = AllSet.empty[Card] ++~ Seq(
    CrumblingVestige() * 4,
    new Mountain() * 4,
    new LotusPetal * 8,
    //new PeatBog() * 4,
    //new SandstoneNeedle() * 4,
    //ThrivingBluff() * 4,
  //  ThrivingIsle() * 4,
  //  ThrivingMoor() * 4,
    //5
    // new BreathOfLife * 4,
  //  new CarefulStudy * 4,
//    new CatharticReunion * 4,
//    new Ponder * 4,
//    new MerchantOfTheVale * 4,
    //new DangerousWager * 4,
    //new DarkRitual * 4,
    //new Duress * 4,
    new Exhume * 4,
    //new FaithlessLooting() * 4,
    new HandOfEmrakul * 2,
    //new Manamorphose * 4,
    //new RiseAgain * 4,
    //new SimianSpiritGuide * 4,
    //new ThrillOfPossibility * 4,
    new InsolentNeonate * 4,
   // new IdeasUnbound * 4,
    //new TolarianWinds * 4,
  //  new DeepAnalysis * 4,
    //new TolarianWinds * 4,
  //  new DragonBreath * 4,
    //new UlamogsCrusher * 4
  ).flatten

}