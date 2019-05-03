package io

import play.api.libs.json.Json

/**
  * Pet is an animal who is considered to be a family member
  *
  * @param name Pet usually has one name
  * @param weight Weight of this Pet in KG.
  */
case class Pet(
  name: String,
  weight: Double
)

object Pet {

  implicit val petFormat = Json.format[Pet]

}
