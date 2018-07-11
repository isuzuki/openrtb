package io.github.isuzuki.openrtb2_5.response

import io.github.isuzuki.openrtb2_5.NoBidReasonCode

trait BidResponse {
  val id:         String
  val seatbid:    List[SeatBid]
  val bidid:      Option[String]
  val cur:        Option[String] = Some("USD")
  val customdata: Option[String]
  val nbr:        Option[NoBidReasonCode]
  val ext:        Option[Ext]
}
