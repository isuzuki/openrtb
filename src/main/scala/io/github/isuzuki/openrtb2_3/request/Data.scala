package io.github.isuzuki.openrtb2_3.request

trait Data {
  val id:      Option[String]
  val name:    Option[String]
  val segment: List[Segment]
  val ext:     Option[Ext]
}
