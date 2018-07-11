package io.github.isuzuki.openrtb2_4.request

trait Geo {
  val lat:           Option[Float]
  val lon:           Option[Float]
  val `type`:        Option[Int]
  val accuracy:      Option[Int]
  val lastfix:       Option[Int]
  val ipservice:     Option[Int]
  val country:       Option[String]
  val region:        Option[String]
  val regionfips104: Option[String]
  val metro:         Option[String]
  val city:          Option[String]
  val zip:           Option[String]
  val utcoffset:     Option[Int]
  val ext:           Option[Ext]
}
