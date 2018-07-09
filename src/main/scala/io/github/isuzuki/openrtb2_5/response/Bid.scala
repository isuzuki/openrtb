package io.github.isuzuki.openrtb2_5.response

trait Bid {
  val id:             String
  val impid:          String
  val price:          Float
  val nurl:           Option[String]
  val burl:           Option[String]
  val lurl:           Option[String]
  val adm:            Option[String]
  val adid:           Option[String]
  val adomain:        List[String]
  val bundle:         Option[String]
  val iurl:           Option[String]
  val cid:            Option[String]
  val crid:           Option[String]
  val tactic:         Option[String]
  val cat:            List[String]
  val attr:           List[Int]
  val api:            Option[Int]
  val protocol:       Option[Int]
  val qagmediarating: Option[Int]
  val language:       Option[String]
  val dealid:         Option[String]
  val w:              Option[Int]
  val h:              Option[Int]
  val wratio:         Option[Int]
  val hratio:         Option[Int]
  val exp:            Option[Ext]
  val ext:            Option[Ext]
}
