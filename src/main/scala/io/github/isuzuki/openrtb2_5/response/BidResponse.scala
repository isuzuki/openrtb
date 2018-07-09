package io.github.isuzuki.openrtb2_5.response

trait BidResponse {
  val id:         String
  val seatbid:    List[SeatBid]
  val bidid:      Option[String]
  val cur:        Option[String] = Some("USD")
  val customdata: Option[String]
  val nbr:        Option[Int]
  val ext:        Option[Ext]
}
