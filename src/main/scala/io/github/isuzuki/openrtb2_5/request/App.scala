package io.github.isuzuki.openrtb2_5.request

trait App {
  val id:            Option[String]
  val name:          Option[String]
  val bundle:        Option[String]
  val domain:        Option[String]
  val storeurl:      Option[String]
  val cat:           List[String]
  val sectioncat:    List[String]
  val pagecat:       List[String]
  val ver:           Option[String]
  val privacypolicy: Option[Int]
  val paid:          Option[Int]
  val publisher:     Option[Publisher]
  val content:       Option[Content]
  val keywords:      Option[String] // Comma separated list of keywords.
  val ext:           Option[Ext]
}
