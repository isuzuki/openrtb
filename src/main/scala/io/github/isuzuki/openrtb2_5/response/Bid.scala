package io.github.isuzuki.openrtb2_5.response

import io.github.isuzuki.openrtb2_5.{APIFramework, CreativeAttribute, IQGMediaRating, Protocol}

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
  val attr:           List[CreativeAttribute]
  val api:            Option[APIFramework]
  val protocol:       Option[Protocol]
  val qagmediarating: Option[IQGMediaRating]
  val language:       Option[String]
  val dealid:         Option[String]
  val w:              Option[Int]
  val h:              Option[Int]
  val wratio:         Option[Int]
  val hratio:         Option[Int]
  val exp:            Option[Ext]
  val ext:            Option[Ext]
}
