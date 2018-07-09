package io.github.isuzuki.openrtb2_5.request

trait Format {
  val w:      Option[Int]
  val h:      Option[Int]
  val wratio: Option[Int]
  val hratio: Option[Int]
  val wmin:   Option[Int]
  val ext:    Option[Ext]
}
