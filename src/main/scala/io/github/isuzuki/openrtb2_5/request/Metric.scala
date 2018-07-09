package io.github.isuzuki.openrtb2_5.request

trait Metric {
  val `type`: String
  val value:  Float
  val vendor: Option[String]
  val ext:    Option[Ext]
}
