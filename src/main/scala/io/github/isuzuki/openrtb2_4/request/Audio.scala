package io.github.isuzuki.openrtb2_4.request

trait Audio {
  val mimes:         List[String]
  val minduration:   Option[Int]
  val maxduration:   Option[Int]
  val protocols:     List[Int]
  val startdelay:    Option[Int]
  val sequence:      Option[Int]
  val battr:         List[Int]
  val maxextended:   Option[Int]
  val minbitrate:    Option[Int]
  val maxbitrate:    Option[Int]
  val delivery:      List[Int]
  val companionad:   List[Banner]
  val api:           List[Int]
  val companiontype: List[Int]
  val maxseq:        Option[Int]
  val feed:          Option[Int]
  val stitched:      Option[Int]
  val nvol:          Option[Int]
  val ext:           Option[Ext]
}
