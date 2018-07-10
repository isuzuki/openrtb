package io.github.isuzuki.openrtb2_3.request

import io.github.isuzuki.openrtb2_3._

trait Video {
  val mimes:          List[String]
  val minduration:    Option[Int]
  val maxduration:    Option[Int]
  @deprecated("Use of protocols.", "OpenRTB ver2.3")
  val protocol:       Option[VideoProtocol]
  val protocols:      List[VideoProtocol]
  val w:              Option[Int]
  val h:              Option[Int]
  val startdelay:     Option[VideoStartDelay]
  val linearity:      Option[VideoLinearity]
  val sequence:       Option[CreativeAttribute]
  val battr:          List[Int]
  val maxextended:    Option[Int]
  val minbitrate:     Option[Int]
  val maxbitrate:     Option[Int]
  val boxingallowed:  Option[Int] = Some(1)
  val playbackmethod: List[VideoPlaybackMethod]
  val delivery:       List[ContentDeliveryMethod]
  val pos:            Option[AdPosition]
  val companionad:    List[Banner]
  val api:            List[APIFramework]
  val companiontype:  List[VASTCompanionType]
  val ext:            Option[Ext]
}
