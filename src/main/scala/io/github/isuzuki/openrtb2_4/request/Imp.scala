package io.github.isuzuki.openrtb2_4.request

trait Imp {
  val id:                String
  val banner:            Option[Banner]
  val video:             Option[Video]
  val audio:             Option[Audio]
  val native:            Option[Native]
  val pmp:               Option[Pmp]
  val displaymanager:    Option[String]
  val displaymanagerver: Option[String]
  val instl:             Option[Int] = Some(0)
  val tagid:             Option[String]
  val bidfloor:          Option[Float]  = Some(0)
  val bidfloorcur:       Option[String] = Some("USD")
  val clickbrowser:      Option[Int]
  val secure:            Option[Int]
  val iframebuster:      List[String]
  val exp:               Option[Int]
  val ext:               Option[Ext]
}
