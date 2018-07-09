package io.github.isuzuki.openrtb2_4.request

trait Deal {
  val id:          String
  val bidfloor:    Option[Float]  = Some(0)
  val bidfloorcur: Option[String] = Some("USD")
  val at:          Option[Int]
  val wseat:       List[String]
  val wadomain:    List[String]
  val ext:         Option[Ext]
}
