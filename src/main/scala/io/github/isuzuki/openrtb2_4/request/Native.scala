package io.github.isuzuki.openrtb2_4.request

import io.github.isuzuki.openrtb2_4.{APIFramework, CreativeAttribute}

trait Native {
  val request: String
  val ver:     Option[String]
  val api:     List[APIFramework]
  val battr:   List[CreativeAttribute]
  val ext:     Option[Ext]
}
