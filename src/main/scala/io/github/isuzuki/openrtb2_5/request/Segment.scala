package io.github.isuzuki.openrtb2_5.request

trait Segment {
  val id:    Option[String]
  val name:  Option[String]
  val value: Option[String]
  val ext:   Option[Ext]
}
