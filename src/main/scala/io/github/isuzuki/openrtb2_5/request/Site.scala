package io.github.isuzuki.openrtb2_5.request

trait Site {
  val id:            Option[String]
  val name:          Option[String]
  val domain:        Option[String]
  val cat:           List[String]
  val sectioncat:    List[String]
  val pagecat:       List[String]
  val page:          Option[String]
  val ref:           Option[String]
  val search:        Option[String]
  val mobile:        Option[Int]
  val privacypolicy: Option[Int]
  val publisher:     Option[Publisher]
  val content:       Option[Content]
  val keywords:      Option[String] // Comma separated list of keywords.
  val ext:           Option[Ext]
}
