package io.github.isuzuki.openrtb2_3.request

trait Pmp {
  val private_auction: Option[Int]
  val deals:           List[Deal]
  val ext:             Option[Ext]
}
