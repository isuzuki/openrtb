package io.github.isuzuki.openrtb2_4.response

import io.github.isuzuki.openrtb2_4.{APIFramework, IQGMediaRating, Protocol}

trait Bid {
  val id:             String
  val impid:          String
  val price:          Float
  val adid:           Option[String]
  val nurl:           Option[String]
  val adm:            Option[String]
  val adomain:        List[String]
  val bundle:         Option[String]
  val iurl:           Option[String]
  val cid:            Option[String]
  val crid:           Option[String]
  val cat:            List[String]
  val attr:           List[Int]
  val api:            Option[APIFramework]
  val protocol:       Option[Protocol]
  val qagmediarating: Option[IQGMediaRating]
  val dealid:         Option[String]
  val w:              Option[Int]
  val h:              Option[Int]
  val exp:            Option[Int]
  val ext:            Option[Ext]
}
