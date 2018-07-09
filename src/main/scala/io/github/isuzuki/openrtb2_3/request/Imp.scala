package io.github.isuzuki.openrtb2_3.request

trait Imp {
  val id:                String
  val banner:            Option[Banner]
  val video:             Option[Video]
  val native:            Option[Native]
  val displaymanager:    Option[String]
  val displaymanagerver: Option[String]
  val instl:             Option[Int] = Some(0)
  val tagid:             Option[String]
  val bidfloor:          Option[Float]  = Some(0)
  val bidfloorcur:       Option[String] = Some("USD")
  val secure:            Option[Int]
  val iframebuster:      List[String]
  val pmp:               Option[Pmp]
  val ext:               Option[Ext]
}
