package io.github.isuzuki.openrtb2_3.request

trait Banner {
  val w:        Option[Int]
  val h:        Option[Int]
  val wmax:     Option[Int]
  val hmax:     Option[Int]
  val wmin:     Option[Int]
  val hmin:     Option[Int]
  val id:       Option[String]
  val btype:    List[Int]
  val battr:    List[Int]
  val pos:      Option[Int]
  val mimes:    List[String]
  val topframe: Option[Int]
  val expdir:   List[Int]
  val api:      List[Int]
  val ext:      Option[Ext]
}
