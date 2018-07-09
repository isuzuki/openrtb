package io.github.isuzuki.openrtb2_3.request

trait Video {
  val mimes:          List[String]
  val minduration:    Option[Int]
  val maxduration:    Option[Int]
  @deprecated("Use of protocols.", "OpenRTB ver2.3")
  val protocol:       Option[Int]
  val protocols:      List[Int]
  val w:              Option[Int]
  val h:              Option[Int]
  val startdelay:     Option[Int]
  val linearity:      Option[Int]
  val sequence:       Option[Int]
  val battr:          List[Int]
  val maxextended:    Option[Int]
  val minbitrate:     Option[Int]
  val maxbitrate:     Option[Int]
  val boxingallowed:  Option[Int] = Some(1)
  val playbackmethod: List[Int]
  val delivery:       List[Int]
  val pos:            Option[Int]
  val companionad:    List[Banner]
  val api:            List[Int]
  val companiontype:  List[Int]
  val ext:            Option[Ext]
}
