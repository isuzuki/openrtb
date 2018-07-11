package io.github.isuzuki.openrtb2_4.request

import io.github.isuzuki.openrtb2_4.{IPLocationService, LocationType}

trait Geo {
  val lat:           Option[Float]
  val lon:           Option[Float]
  val `type`:        Option[LocationType]
  val accuracy:      Option[Int]
  val lastfix:       Option[Int]
  val ipservice:     Option[IPLocationService]
  val country:       Option[String]
  val region:        Option[String]
  val regionfips104: Option[String]
  val metro:         Option[String]
  val city:          Option[String]
  val zip:           Option[String]
  val utcoffset:     Option[Int]
  val ext:           Option[Ext]
}
