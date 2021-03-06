package io.github.isuzuki.openrtb2_4.request

trait BidRequest {
  val id:      String
  val imp:     List[Imp]
  val site:    Option[Site]
  val app:     Option[App]
  val device:  Option[Device]
  val user:    Option[User]
  val test:    Option[Int] = Some(0)
  val at:      Option[Int] = Some(2)
  val tmax:    Option[Int]
  val wseat:   List[String]
  val allimps: Option[Int] = Some(0)
  val cur:     List[String]
  val bcat:    List[String]
  val badv:    List[String]
  val bapp:    List[String]
  val regs:    Option[Regs]
  val ext:     Option[Ext]
}
