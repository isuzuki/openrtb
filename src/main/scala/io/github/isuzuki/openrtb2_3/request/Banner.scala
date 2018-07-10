package io.github.isuzuki.openrtb2_3.request

import io.github.isuzuki.openrtb2_3._

trait Banner {
  val w:        Option[Int]
  val h:        Option[Int]
  val wmax:     Option[Int]
  val hmax:     Option[Int]
  val wmin:     Option[Int]
  val hmin:     Option[Int]
  val id:       Option[String]
  val btype:    List[BannerAdType]
  val battr:    List[CreativeAttribute]
  val pos:      Option[AdPosition]
  val mimes:    List[String]
  val topframe: Option[Int]
  val expdir:   List[ExpandableDirection]
  val api:      List[APIFramework]
  val ext:      Option[Ext]
}
