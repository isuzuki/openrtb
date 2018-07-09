package io.github.isuzuki.openrtb2_5.request

trait User {
  val id:         Option[String]
  val buyeruid:   Option[String]
  val yob:        Option[Int]
  val gender:     Option[String]
  val keywords:   Option[String] // Comma separated list of keywords.
  val customdata: Option[String]
  val geo:        Option[Geo]
  val data:       List[Data]
  val ext:        Option[Ext]
}
