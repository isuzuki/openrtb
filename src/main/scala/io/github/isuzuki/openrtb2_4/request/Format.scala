package io.github.isuzuki.openrtb2_4.request

trait Format {
  val w:   Option[Int]
  val h:   Option[Int]
  val ext: Option[Ext]
}
