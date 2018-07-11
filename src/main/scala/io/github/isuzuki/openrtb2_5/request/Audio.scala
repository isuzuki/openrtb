package io.github.isuzuki.openrtb2_5.request

import io.github.isuzuki.openrtb2_5._

trait Audio {
  val mimes:         List[String]
  val minduration:   Option[Int]
  val maxduration:   Option[Int]
  val protocols:     List[Protocol]
  val startdelay:    Option[StartDelay]
  val sequence:      Option[Int]
  val battr:         List[CreativeAttribute]
  val maxextended:   Option[Int]
  val minbitrate:    Option[Int]
  val maxbitrate:    Option[Int]
  val delivery:      List[ContentDeliveryMethod]
  val companionad:   List[Banner]
  val api:           List[Int]
  val companiontype: List[CompanionType]
  val maxseq:        Option[Int]
  val feed:          Option[FeedType]
  val stitched:      Option[Int]
  val nvol:          Option[VolumeNormalizationMode]
  val ext:           Option[Ext]
}
