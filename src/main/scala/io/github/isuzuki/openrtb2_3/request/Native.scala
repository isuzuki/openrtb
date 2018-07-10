package io.github.isuzuki.openrtb2_3.request

import io.github.isuzuki.openrtb2_3.{APIFramework, CreativeAttribute}

trait Native {
  val request: String
  val ver:     Option[String]
  val api:     List[APIFramework]
  val battr:   List[CreativeAttribute]
  val ext:     Option[Ext]
}
