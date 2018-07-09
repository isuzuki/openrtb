package io.github.isuzuki.openrtb2_5.request

trait Producer {
  val id:     Option[String]
  val name:   Option[String]
  val cat:    List[String]
  val domain: Option[String]
  val ext:    Option[Ext]
}
