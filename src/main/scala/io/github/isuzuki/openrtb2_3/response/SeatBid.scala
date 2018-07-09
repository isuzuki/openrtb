package io.github.isuzuki.openrtb2_3.response

trait SeatBid {
  val bid:   List[Bid] // required.
  val seat:  Option[String]
  val group: Option[Int] = Some(0)
  val ext:   Option[Ext]
}
