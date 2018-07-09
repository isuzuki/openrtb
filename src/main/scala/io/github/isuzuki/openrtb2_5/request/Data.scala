package io.github.isuzuki.openrtb2_5.request

trait Data {
  val id:      Option[String]
  val name:    Option[String]
  val segment: List[Segment]
  val ext:     Option[Ext]
}
