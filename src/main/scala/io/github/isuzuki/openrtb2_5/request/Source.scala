package io.github.isuzuki.openrtb2_5.request

trait Source {
  val fd:     Option[Int]
  val tid:    Option[String]
  val pchain: Option[String]
  val ext:    Option[Ext]
}
