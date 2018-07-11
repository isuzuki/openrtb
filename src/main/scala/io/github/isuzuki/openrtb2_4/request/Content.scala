package io.github.isuzuki.openrtb2_4.request

import io.github.isuzuki.openrtb2_4.{IQGMediaRating, ProductionQuality}

trait Content {
  val id:                 Option[String]
  val episode:            Option[Int]
  val title:              Option[String]
  val series:             Option[String]
  val season:             Option[String]
  val artist:             Option[String]
  val genre:              Option[String]
  val album:              Option[String]
  val isrc:               Option[String]
  val producer:           Option[Producer]
  val url:                Option[String]
  val cat:                List[String]
  val prodq:              Option[ProductionQuality]
  @deprecated("Deprecated in favor of prodq.", "OpenRTB ver2.4")
  val videoquality:       Option[ProductionQuality]
  val context:            Option[Int]
  val contentrating:      Option[String]
  val userrating:         Option[String]
  val qagmediaration:     Option[IQGMediaRating]
  val keywords:           Option[String] // Comma separated list of keywords.
  val livestream:         Option[Int]
  val sourcerelationship: Option[Int]
  val len:                Option[Int]
  val language:           Option[String]
  val embeddable:         Option[Int]
  val ext:                Option[Ext]
}
