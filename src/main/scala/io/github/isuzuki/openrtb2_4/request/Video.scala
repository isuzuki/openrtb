package io.github.isuzuki.openrtb2_4.request

import io.github.isuzuki.openrtb2_4._

trait Video {
  val mimes:          List[String]
  val minduration:    Option[Int]
  val maxduration:    Option[Int]
  val protocols:      List[Protocol]
  @deprecated("Use of protocols.", "OpenRTB ver2.3")
  val protocol:       Option[Protocol]
  val w:              Option[Int]
  val h:              Option[Int]
  val startdelay:     Option[StartDelay]
  val linearity:      Option[VideoLinearity]
  val skip:           Option[Int]
  val skipmin:        Option[Int] = Some(0)
  val skipafter:      Option[Int] = Some(0)
  val sequence:       Option[Int]
  val battr:          List[CreativeAttribute]
  val maxextended:    Option[Int]
  val minbitrate:     Option[Int]
  val maxbitrate:     Option[Int]
  val boxingallowed:  Option[Int] = Some(1)
  val playbackmethod: List[PlaybackMethod]
  val delivery:       List[ContentDeliveryMethod]
  val pos:            Option[AdPosition]
  val companionad:    List[Banner]
  val api:            List[Int]
  val companiontype:  List[CompanionType]
  val ext:            Option[Ext]
}
