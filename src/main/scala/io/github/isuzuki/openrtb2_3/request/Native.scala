package io.github.isuzuki.openrtb2_3.request

trait Native {
  val request: String
  val ver:     Option[String]
  val api:     List[Int]
  val battr:   List[Int]
  val ext:     Option[Ext]
}
