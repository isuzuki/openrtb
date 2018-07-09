package io.github.isuzuki.openrtb2_4.request

trait Banner {
  val w:        Option[Int]
  val h:        Option[Int]
  val format:   List[Format]
  @deprecated("Deprecated in favor of the format array", "OpenRTB ver2.4")
  val wmax:     Option[Int]
  @deprecated("Deprecated in favor of the format array", "OpenRTB ver2.4")
  val hmax:     Option[Int]
  @deprecated("Deprecated in favor of the format array", "OpenRTB ver2.4")
  val wmin:     Option[Int]
  @deprecated("Deprecated in favor of the format array", "OpenRTB ver2.4")
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