package io.github.isuzuki.openrtb2_3.request

import io.github.isuzuki.openrtb2_3.{ContentContext, QAGMediaRating, VideoQuality}

trait Content {
  val id:                 Option[String]
  val episode:            Option[Int]
  val title:              Option[String]
  val series:             Option[String]
  val season:             Option[String]
  val producer:           Option[Producer]
  val url:                Option[String]
  val cat:                List[String]
  val videoquality:       Option[VideoQuality]
  val context:            Option[ContentContext]
  val contentrating:      Option[String]
  val userrating:         Option[String]
  val qagmediaration:     Option[QAGMediaRating]
  val keywords:           Option[String] // Comma separated list of keywords.
  val livestream:         Option[Int]
  val sourcerelationship: Option[Int]
  val len:                Option[Int]
  val language:           Option[String]
  val embeddable:         Option[Int]
  val ext:                Option[Ext]
}
