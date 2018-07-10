package io.github.isuzuki.openrtb2_3.response

import io.github.isuzuki.openrtb2_3.NoBidReasonCode

trait BidResponse {
  val id:         String
  val seatbid:    List[SeatBid]
  val bidid:      Option[String]
  val cur:        Option[String] = Some("USD")
  val customdata: Option[String]
  val nbr:        Option[NoBidReasonCode]
  val ext:        Option[Ext]
}
